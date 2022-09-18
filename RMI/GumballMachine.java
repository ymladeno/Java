import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote {
    // Creating an object here mean that JVM will do it while loading the class
    // The object will be created even ctor is not called
    // It is a thread safe

    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State soldOutState;

    State currentState;
    int gumballCounter = 0;
    String location;

    public void setState(State newState) { currentState = newState; }
    public State getNoQuarterState() { return noQuarterState; }
    public State getHasQuarterState() { return hasQuarterState; }
    public State getSoldState() { return soldState; }
    public State getSoldOutState() { return soldOutState; }
    
    public void releaseGumball() {
        System.out.println("Gumball is comming");
        --gumballCounter;
    }

    public GumballMachine(String location, int gumballCounter) throws RemoteException {
        noQuarterState = new NoQuarter(this);
        hasQuarterState = new HasQuarter(this);
        soldState = new Sold(this);
        soldOutState = new SoldOut(this);

        this.location = location;
        currentState = soldOutState;

        if (gumballCounter > 0) {
            currentState = noQuarterState;
            this.gumballCounter = gumballCounter;
        }
    }

    public void insertQuarter() { currentState.insertQuarter(); }
    public void ejectQuarter() { currentState.ejectQuarter(); }
    public void turnCrack() { 
        currentState.turnCrack();
        currentState.dispence();
    }
    public void fillin(int count) {
        System.out.println("Fill in with gumballs: " + count);
        gumballCounter = count;
        currentState.fillin(count);
    }

    public String toString() {
        return "State: " + currentState + ". Gumballs: " + gumballCounter; 
    }

    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public int getGumballsCounter() {
        return gumballCounter;
    }

    @Override
    public State getState() {
        return currentState;
    }
}
