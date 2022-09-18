package MVC;

public class HeartTest {
    public static void main(String[] args) {
        HeartModelInterface model = new HeartModel();
        HeartModelAdapter adaptedModel = new HeartModelAdapter(model);
        ControllerInterface controller = new BeatControllerImp(adaptedModel);
    }
}
