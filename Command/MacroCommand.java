public class MacroCommand implements Command {
    Command[] commands;

    @Override
    public void execute() {
        for(int i = 0; i < commands.length; ++i) {
            commands[i].execute();
        }
    }

    @Override
    public void undo() {
        for(int i = 0; i < commands.length; ++i) {
            commands[i].undo();
        }
    }

    MacroCommand(Command[] commands) { this.commands = commands; }
}
