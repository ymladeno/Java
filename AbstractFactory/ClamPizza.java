public class ClamPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Prepare clam pizza");
        Dough dough = ingredientFactory.createDough();
        Cheese cheese = ingredientFactory.createCheese();
        Sauce sauce = ingredientFactory.createSauce();
    }

    @Override
    public void bake() {
        System.out.println("Bake clam pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cut clam pizza");   
    }

    @Override
    public void box() {
        System.out.println("Box clam pizza");
    }

    ClamPizza(AbstractIngredientFactory factory) { super(factory); }
}