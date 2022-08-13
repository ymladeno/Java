public abstract class Duck {
    public FlyBehaviour flyBehaviour;
    public void setFlyBehaviour(FlyBehaviour fly) { flyBehaviour = fly; }
    public abstract void display();
    public void fly() { flyBehaviour.fly(); }
}