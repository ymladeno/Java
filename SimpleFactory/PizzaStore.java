import java.lang.*;

public class PizzaStore {
    private FactoryPizza pizzaFactory;

    public Pizza orderPizza(String type) {
        Pizza pizza = pizzaFactory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    PizzaStore(FactoryPizza factory) { this.pizzaFactory = factory; }
}