public class CloseGarageDoorCommand implements Command {
    GarageDoor garagedoor;

    @Override
    public void execute() {
        garagedoor.close();
    }

    @Override
    public void undo() {
        garagedoor.open();
        
    }

    CloseGarageDoorCommand(GarageDoor worker) { garagedoor = worker; }
}
