package AllTogether;

public class MallardDuck implements Quackable {
    Observable observable;

    @Override
    public void quack() {
        System.out.println("Mallard duck: quack");
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

    public MallardDuck() {
        observable = new QuackObservable(this);
    }
}
