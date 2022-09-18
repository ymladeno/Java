import java.rmi.Remote;

import java.rmi.*;

public interface GumballMachineRemote extends Remote {
    public String getLocation() throws RemoteException;
    public int getGumballsCounter() throws RemoteException;
    public State getState() throws RemoteException;
}
