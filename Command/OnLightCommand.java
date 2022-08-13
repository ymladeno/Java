public class OnLightCommand implements Command {
    private Light light;

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }

    OnLightCommand(Light light) { this.light = light; }
}
