public class RemoteControlTest {
    public static void main(String[] args) {
        Light kitchenLight = new Light("Kitchen light");
        Light livingLight = new Light("Living light");
        GarageDoor garageDoor = new GarageDoor();

        OnLightCommand onKitchenLight = new OnLightCommand(kitchenLight);
        OffLightCommand offKitchenLight = new OffLightCommand(kitchenLight);

        OnLightCommand onLivingLight = new OnLightCommand(livingLight);
        OffLightCommand offLivingLight = new OffLightCommand(livingLight);

        OpenGarageDoorCommand openGarageDoor = new OpenGarageDoorCommand(garageDoor);
        CloseGarageDoorCommand closeGarageDoor = new CloseGarageDoorCommand(garageDoor);

        Command[] partyOnCommand = {openGarageDoor, onKitchenLight, onLivingLight};
        Command[] partyOffCommand = {closeGarageDoor, offKitchenLight, offLivingLight};
    
        MacroCommand partyOnMacroCommand = new MacroCommand(partyOnCommand);
        MacroCommand partyOffMacroCommand = new MacroCommand(partyOffCommand);

        RemoteControl remoteControl = new RemoteControl();

        remoteControl.setCommand(0, onKitchenLight, offKitchenLight);
        remoteControl.setCommand(1, onLivingLight, offLivingLight);
        remoteControl.setCommand(2, openGarageDoor, closeGarageDoor);
        remoteControl.setCommand(3, partyOnMacroCommand, partyOffMacroCommand);

        // System.out.println("\n======== Test slot 0 =======\n");
        // remoteControl.pushOnButton(0);
        // remoteControl.pushOffButton(0);
        // System.out.println(remoteControl);
        // remoteControl.pushUndoButton(0);

        // System.out.println("\n======== Test slot 1 =======\n");
        // remoteControl.pushOnButton(1);
        // remoteControl.pushOffButton(1);
        // System.out.println(remoteControl);
        // remoteControl.pushUndoButton(1);

        // System.out.println("\n======== Test slot 2 =======\n");
        // remoteControl.pushOnButton(2);
        // remoteControl.pushOffButton(2);
        // System.out.println(remoteControl);
        // remoteControl.pushUndoButton(2);

        System.out.println("\n======== Test slot 3 =======\n");
        remoteControl.pushOnButton(3);
        remoteControl.pushOffButton(3);
        System.out.println(remoteControl);
        remoteControl.pushUndoButton(3);
    }
}
