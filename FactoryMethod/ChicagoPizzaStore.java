public class ChicagoPizzaStore extends PizzaStore {
    public Pizza createPizza(String type) {
        Pizza pizza;

        if (type == "veggie") {
            pizza = new VeggiePizza("ChicagoVeggie");
        } else if (type == "clam") {
            pizza = new ClamPizza("ChicagoClam");
        } else {
            throw new IllegalArgumentException();
        }

        return pizza;
    }
}
