import java.rmi.*;

public class GumballMonitorTest {
    public static void main(String[] args) {
        String name = new String("rmi://127.0.0.1/SofiaGumballmachine");
        if (args.length > 0) {
            name = args[0];
        }
        try {
            GumballMachineRemote gumballmachine = (GumballMachineRemote)Naming.lookup(name);
            GumballMachineMonitor gumballMonitor = new GumballMachineMonitor(gumballmachine);
            gumballMonitor.report();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
