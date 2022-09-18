package MVC;

import java.util.ArrayList;
import java.util.Random;

public class HeartModel implements HeartModelInterface, Runnable {
    ArrayList<BeatObserver> beatObservers = new ArrayList<BeatObserver>();
    ArrayList<BPMObserver> bpmObservers = new ArrayList<BPMObserver>();
    Thread thread;
    Random random = new Random(System.currentTimeMillis());
    int time = 1000;
    int lastrate = 0;

    public HeartModel() {
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public int getHeartRate() {
        return lastrate;
    }

    @Override
    public void registerObservers(BeatObserver observer) {
        beatObservers.add(observer);
    }

    @Override
    public void registerObservers(BPMObserver observer) {
        bpmObservers.add(observer);
    }

    @Override
    public void run() {
        for(;;) {
            int change = random.nextInt(10);
            int rate = 60000/(time + change);
            if (rate < 120 && rate > 50) {
                time += change;
                notifyBeatObservers();
                if (rate != lastrate) {
                    lastrate = rate;
                    notifyBpmObservers();
                }
            }
            try {
                Thread.sleep(time);   
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }

    void notifyBeatObservers() {
        for(int i = 0; i < beatObservers.size(); ++i) {
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
}
