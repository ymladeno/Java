public class NYPizzaStore extends PizzaStore {
    public Pizza createPizza(String type) {
        Pizza pizza;
        AbstractIngredientFactory ingredientFactory = new NYIngredientFactory();

        if (type == "veggie") {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("NY veggie pizza");
        } else if (type == "clam") {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("NY clam pizza");
        } else {
            throw new IllegalArgumentException();
        }

        return pizza;
    }
}
