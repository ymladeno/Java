import java.io.Serializable;

public abstract class State implements Serializable {
    public abstract void insertQuarter();
    public abstract void ejectQuarter();
    public abstract void turnCrack();
    public void dispence() {}
    public void fillin(int count) {}
}
