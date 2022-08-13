public class ChicagoPizzaStore extends PizzaStore {
    private AbstractIngredientFactory ingredientFactory = new ChicagoIngredientFactory();

    public Pizza createPizza(String type) {
        Pizza pizza;

        if (type == "veggie") {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("Chicago veggie pizza");
        } else if (type == "clam") {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Chicago clam pizza");
        } else {
            throw new IllegalArgumentException();
        }

        return pizza;
    }


}
