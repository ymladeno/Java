public class ChicagoClamPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Prepare Chicago clam pizza");
    }

    @Override
    public void bake() {
        System.out.println("Bake Chicago clam pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cut Chicago clam pizza");   
    }

    @Override
    public void box() {
        System.out.println("Box Chicago clam pizza");
    }

    ChicagoClamPizza(String name) { super(name); }
}