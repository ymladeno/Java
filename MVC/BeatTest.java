package MVC;

public class BeatTest {
    public static void main(String[] args) {
        BeatModelInterface model = new BeatModel();
        ControllerInterface controller = new BeatControllerImp(model);
    }
}
