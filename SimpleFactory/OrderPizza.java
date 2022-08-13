public class OrderPizza {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore(new FactoryPizza());
        Pizza pizza = pizzaStore.orderPizza("veggie");

        System.out.println("Here is " + pizza.name() + " pizza");
    }
}
