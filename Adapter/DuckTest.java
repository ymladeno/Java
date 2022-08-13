public class DuckTest {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.quack();
        duck.fly();

        Turkey turkey = new WildTurkey();
        turkey.gobble();
        turkey.fly();

        TurkeyToDuckConverter newDuck = new TurkeyToDuckConverter(turkey);

        testDuck(newDuck);
    }


    private static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
