package AllTogether;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator test = new DuckSimulator();
        test.simulate();
    }

    public void simulate() {
        AbstractFactoryQuackable quackableCounterFactory = new QuackableCounterFactory();

        Quackable mallardDuck = quackableCounterFactory.createMallardDuck();
        Quackable redHeadDuck = quackableCounterFactory.createRedHeadDuck();
        Goose goose = new Goose();
        DuckAdapter gooseLikeDuck = new DuckAdapter(goose);

        FlockDuck flock = new FlockDuck();
        flock.add(mallardDuck);
        flock.add(redHeadDuck);
        flock.add(gooseLikeDuck);

        Quackable rubberDuck = quackableCounterFactory.createRubberDuck();
        Quackable mallardDuck2 = quackableCounterFactory.createMallardDuck();
        FlockDuck flockDuck = new FlockDuck();

        flockDuck.add(rubberDuck);
        flockDuck.add(mallardDuck2);
        flock.add(flockDuck);

        Observer quackologist = new Quackologist();
        flock.registerObserver(quackologist);

        simulate(flock);
        System.out.println("Quackologist: quack counter: " + QuackableCounter.getQuackCounter());
    }

    public void simulate(Quackable duck) {
        duck.quack();
    }
}
