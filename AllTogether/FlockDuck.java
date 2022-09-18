package AllTogether;

import java.util.ArrayList;
import java.util.Iterator;

public class FlockDuck implements Quackable {
    private ArrayList<Quackable> quackables;

    @Override
    public void quack() {
        Iterator<Quackable> it = quackables.iterator();
        
        while(it.hasNext()) {
            Quackable duck = it.next();
            duck.quack();
        }
    }

    public void add(Quackable duck) {
        quackables.add(duck);
    }

    @Override
    public void registerObserver(Observer observer) {
        Iterator<Quackable> it = quackables.iterator();
        while (it.hasNext()) {
            Quackable duck = it.next();
            duck.registerObserver(observer);
        }
    }

    @Override
    public void notifyObservers() {
        
    }

    public FlockDuck() {
        quackables = new ArrayList<Quackable>();
    }
}
