package AllTogether;

public class QuackableCounterFactory implements AbstractFactoryQuackable {
    @Override
    public Quackable createMallardDuck() {
        return new QuackableCounter(new MallardDuck());
    }

    @Override
    public Quackable createRedHeadDuck() {
        return new QuackableCounter(new RedHeadDuck());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackableCounter(new RubberDuck());
    }
}
