public class DuckSimulator {
    public static void main(String[] args) {
        Duck d1 = new MarvallDuck();
        d1.display();
        d1.setFlyBehaviour(new FlyLikeADuck());
        d1.fly();

        Duck d2 = new RubbyDuck();
        d2.display();
        d2.setFlyBehaviour(new NoFly());
        d2.fly();
    }
}