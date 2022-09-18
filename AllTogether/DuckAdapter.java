package AllTogether;

public class DuckAdapter implements Quackable {
    private Goose goose;
    private Observable observable;

    @Override
    public void quack() {
        goose.honk();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }

    public DuckAdapter(Goose goose) {
        this.goose = goose;
        observable = new QuackObservable(this);
    }
}
