public class OffLightCommand implements Command {
    private Light light;

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }

    OffLightCommand(Light light) { this.light = light; }
}
