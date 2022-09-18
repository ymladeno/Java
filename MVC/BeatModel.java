package MVC;

import java.util.ArrayList;

import javax.sound.midi.MetaEventListener;
import javax.sound.midi.MetaMessage;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;

public class BeatModel implements BeatModelInterface, MetaEventListener {
    int bpm = 0;
    Sequence sequence;
    Sequencer sequencer;
    Track track;
    ArrayList<BeatObserver> beatObservers = new ArrayList<BeatObserver>();
    ArrayList<BPMObserver> bpmObservers = new ArrayList<BPMObserver>();

    @Override
    public void initialize() {
        try {
            sequencer = MidiSystem.getSequencer();
            sequencer.open();
            sequencer.addMetaEventListener(this);

            sequence = new Sequence(Sequence.PPQ, 4);
            track = sequence.createTrack();
            sequencer.setTempoInBPM(bpm);

            int[] trackList = {35, 0, 46, 0};
            for (int i = 0; i< trackList.length; ++i) {
                int key = trackList[i];
                if (key != 0) {
                    track.add(makeEvent(144, 9, key, 100, i));
                    track.add(makeEvent(128, 9, key, 100, i+1));
                }
            }
            sequencer.setSequence(sequence);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void on() {
        sequencer.start();
        setBPM(90);
    }

    @Override
    public void off() {
        setBPM(0);
        sequencer.stop();
    }

    @Override
    public int getBPM() {
        return bpm;
    }

    @Override
    public void setBPM(int bpm) {
        this.bpm = bpm;
        notifyBpmObservers();
    }

    @Override
    public void meta(MetaMessage message) {
        System.out.println("Message type: " + message.getType());
        if (message.getType() == 47) {
            notifyBeatObservers();
            sequencer.start();
        }
        
    }

    MidiEvent makeEvent(int command, int channel, int one, int two, int tick) {
        try {
            ShortMessage message = new ShortMessage(command, channel, one, two);
            MidiEvent event = new MidiEvent(message, tick);
            return event;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    void notifyBeatObservers() {
        for (int i = 0; i < beatObservers.size(); ++i) {
            BeatObserver observer = beatObservers.get(i);
            observer.updateBeat();
        }
    }

    void notifyBpmObservers() {
        for (int i = 0; i < bpmObservers.size(); ++i) {
            BPMObserver observer = bpmObservers.get(i);
            observer.updateBPM();
        }
    }

    @Override
    public void registerObservers(BeatObserver observer) {
        beatObservers.add(observer);
    }

    @Override
    public void registerObservers(BPMObserver observer) {
        bpmObservers.add(observer);
    }
}
