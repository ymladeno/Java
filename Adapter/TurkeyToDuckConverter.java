public class TurkeyToDuckConverter implements Duck {
    Turkey turkey;
    
    @Override
    public void quack() {
        turkey.gobble();        
    }

    @Override
    public void fly() {
        turkey.fly();
        turkey.fly();
        turkey.fly();
        turkey.fly();
        turkey.fly();
    }

    TurkeyToDuckConverter(Turkey turkey) { this.turkey = turkey; }
}
