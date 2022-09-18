package MVC;

public class BeatControllerImp implements ControllerInterface {
    BeatModelInterface model;
    DJView view;

    public BeatControllerImp(BeatModelInterface model) {
        this.model = model;
        view = new DJView(this, model);

        view.createViewFrame();
        view.createControlFrame();
        view.enableStartMenu();
        view.disableStopMenu();
        model.initialize();
    }

    @Override
    public void start() {
        model.on();
        view.disableStartMenu();
        view.enableStopMenu();
    }

    @Override
    public void stop() {
        view.disableStopMenu();
        view.enableStartMenu();
        model.off();
    }

    @Override
    public void increaseBpm() {
        model.setBPM(model.getBPM() + 1);
    }

    @Override
    public void descreaseBpm() {
        model.setBPM(model.getBPM() - 1);
    }

    @Override
    public void setBpm(int bpm) {
        model.setBPM(bpm);
    }
}
