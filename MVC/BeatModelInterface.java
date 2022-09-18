package MVC;

public interface BeatModelInterface {
    void initialize();
    void on();
    void off();
    void setBPM(int bpm);
    int getBPM();

    void registerObservers(BeatObserver observer);
    void registerObservers(BPMObserver observer);
}
