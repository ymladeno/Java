public class VeggiePizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("Prepare veggie pizza");
    }

    @Override
    public void bake() {
        System.out.println("Bake veggie pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cut veggie pizza");   
    }

    @Override
    public void box() {
        System.out.println("Box veggie pizza");
    }

    VeggiePizza(String name) { super(name); }
}