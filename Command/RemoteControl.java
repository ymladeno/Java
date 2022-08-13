public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    Command lastCommand;

    public void setCommand(int slot, Command oCommand, Command offCommand) {
        onCommands[slot] = oCommand;
        offCommands[slot] = offCommand;
    }

    public void pushOnButton(int slot) {
        lastCommand = onCommands[slot];
        onCommands[slot].execute();
    }

    public void pushOffButton(int slot) {
        lastCommand = offCommands[slot];
        offCommands[slot].execute();
    }

    public void pushUndoButton(int slot) {
        lastCommand.undo();
    }

    RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        for(int i = 0; i < 7; ++i) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
        lastCommand = new NoCommand();
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();

        stringBuffer.append("\n ------------- Remote control --------------\n");
        for(int i = 0; i < onCommands.length; ++i) {
            stringBuffer.append("slot: " + i + " " + onCommands[i].getClass().getName() + " " + offCommands[i].getClass().getName() + "\n");
        }
        stringBuffer.append("Undo: " + lastCommand.getClass().getName() + "\n");
        return stringBuffer.toString();
    }
}
