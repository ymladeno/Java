public abstract class Pizza {
    private String name;
    protected AbstractIngredientFactory ingredientFactory;

    public abstract void prepare();
    public abstract void bake();
    public abstract void cut();
    public abstract void box();
    public String name() { return name; }
    public void setName(String name) { this.name = name; }
    Pizza(AbstractIngredientFactory factory) { ingredientFactory = factory; }
}
