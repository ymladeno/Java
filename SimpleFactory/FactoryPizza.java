public class FactoryPizza {
    public Pizza createPizza(String type) {
        Pizza pizza;

        if (type == "veggie") {
            pizza = new VeggiePizza("Veggie");
        } else if (type == "clam") {
            pizza = new ClamPizza("Clam");
        } else {
            throw new IllegalArgumentException();
        }

        return pizza;
    }
}