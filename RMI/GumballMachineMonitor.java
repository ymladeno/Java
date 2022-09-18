public class GumballMachineMonitor {
    GumballMachineRemote gumballmachine;

    GumballMachineMonitor(GumballMachineRemote gumballmachine) {
        this.gumballmachine = gumballmachine;
    }

    public void report() {
        System.out.println("Gumballmachine:");
        try {
            System.out.println("Location: " + gumballmachine.getLocation());
            System.out.println("Gumballs: " + gumballmachine.getGumballsCounter());
            System.out.println("State: " + gumballmachine.getState());   
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
