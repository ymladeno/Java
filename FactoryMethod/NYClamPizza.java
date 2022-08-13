public class NYClamPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Prepare NY clam pizza");
    }

    @Override
    public void bake() {
        System.out.println("Bake NY clam pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cut NY clam pizza");   
    }

    @Override
    public void box() {
        System.out.println("Box NY clam pizza");
    }

    NYClamPizza(String name) { super(name); }
}