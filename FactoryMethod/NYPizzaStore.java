public class NYPizzaStore extends PizzaStore {

    public Pizza createPizza(String type) {
        Pizza pizza;

        if (type == "veggie") {
            pizza = new NYVeggiePizza("NYVeggie");
        } else if (type == "clam") {
            pizza = new NYClamPizza("NYClam");
        } else {
            throw new IllegalArgumentException();
        }

        return pizza;
    }
    
}
