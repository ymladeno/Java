public class OrderPizza {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new NYPizzaStore();
        Pizza pizza = pizzaStore.orderPizza("veggie");

        System.out.println("Here is " + pizza.name() + " pizza\n\n");

        pizzaStore = new ChicagoPizzaStore();
        pizza = pizzaStore.orderPizza("veggie");

        System.out.println("Here is " + pizza.name() + " pizza");
    }
}
