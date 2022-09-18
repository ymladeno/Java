package AllTogether;

public class QuackableCounter implements Quackable {
    private Quackable quackable;
    private static int quackCounter = 0;

    @Override
    public void quack() {
        quackable.quack();
        ++quackCounter;
    }

    @Override
    public void registerObserver(Observer observer) {
        quackable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        quackable.notifyObservers();
    }

    public QuackableCounter(Quackable quackable) {
        this.quackable = quackable;
    }

    public static int getQuackCounter() { return quackCounter; }
}
