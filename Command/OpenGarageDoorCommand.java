public class OpenGarageDoorCommand implements Command {
    GarageDoor garagedoor;

    @Override
    public void execute() {
        garagedoor.open();
    }

    @Override
    public void undo() {
        garagedoor.close();
        
    }

    OpenGarageDoorCommand(GarageDoor worker) { garagedoor = worker; }
}
