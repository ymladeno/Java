public class NYVeggiePizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("Prepare NY veggie pizza");
    }

    @Override
    public void bake() {
        System.out.println("Bake NY veggie pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cut NY veggie pizza");   
    }

    @Override
    public void box() {
        System.out.println("Box NY veggie pizza");
    }

    NYVeggiePizza(String name) { super(name); }
}