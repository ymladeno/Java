package AllTogether;

public class RubberDuck implements Quackable {
    Observable observable;

    @Override
    public void quack() {
        System.out.println("Rubber duck: squeak");
        observable.notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();    
    }

    public RubberDuck() {
        observable = new QuackObservable(this);
    }
}
