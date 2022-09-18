package AllTogether;

import java.util.ArrayList;
import java.util.Iterator;

public class QuackObservable implements Observable {
    ArrayList<Observer> observers;
    Quackable quackable;

    @Override
    public void registerObserver(Observer observer) {
        System.out.println("Register " + observer);
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        Iterator<Observer> it = observers.iterator();
        while(it.hasNext()) {
            Observer observer = it.next();
            observer.update(quackable);
        }
    }

    QuackObservable(Quackable quackable) {
        observers = new ArrayList<Observer>();
        this.quackable = quackable;
    }
}
