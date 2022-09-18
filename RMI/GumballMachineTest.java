import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;

public class GumballMachineTest {
    public static void main(String[] args) {
        String name = new String("SofiaGumballmachine");
        int gumballs = 10;
        if (args.length == 2) {
            name = args[0];
            gumballs = Integer.parseInt(args[1]);
        }

        try {
            GumballMachineRemote gumballmachine = new GumballMachine(name, gumballs);
            // GumballMachineRemote stub = (GumballMachine)UnicastRemoteObject.exportObject(gumballmachine, 0);
            Naming.rebind(name, gumballmachine);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
