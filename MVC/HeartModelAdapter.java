package MVC;

public class HeartModelAdapter implements BeatModelInterface {
    HeartModelInterface model;

    public HeartModelAdapter(HeartModelInterface model) {
        this.model = model;
    }

    @Override
    public void initialize() {}

    @Override
    public void on() {}

    @Override
    public void off() {}

    @Override
    public int getBPM() {
        return model.getHeartRate();
    }

    @Override
    public void registerObservers(BeatObserver observer) {
        model.registerObservers(observer);
    }

    @Override
    public void registerObservers(BPMObserver observer) {
        model.registerObservers(observer);
    }

    @Override
    public void setBPM(int bpm) { }
}
