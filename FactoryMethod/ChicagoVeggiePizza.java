public class ChicagoVeggiePizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("Prepare Chicago veggie pizza");
    }

    @Override
    public void bake() {
        System.out.println("Bake Chicago veggie pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cut Chicago veggie pizza");   
    }

    @Override
    public void box() {
        System.out.println("Box Chicago veggie pizza");
    }

    ChicagoVeggiePizza(String name) { super(name); }
}