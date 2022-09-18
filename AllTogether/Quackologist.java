package AllTogether;

public class Quackologist implements Observer {
    @Override
    public void update(Quackable quackable) {
        System.out.println("Quackologist: " + quackable + " has just quack");
    }
}
