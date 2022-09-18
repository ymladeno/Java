package MVC;

public interface HeartModelInterface {
    int getHeartRate();
    void registerObservers(BeatObserver observer);
    void registerObservers(BPMObserver observer);
}
