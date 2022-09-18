package AllTogether;

public class RedHeadDuck implements Quackable {
    Observable observable;

    @Override
    public void quack() {
        System.out.println("Readhead duck: quack");
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

    public RedHeadDuck() {
        observable = new QuackObservable(this);
    }
}
