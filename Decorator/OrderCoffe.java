public class OrderCoffe {
    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        Beverage coffe = new Milk(new Milk(espresso));
        System.out.println(coffe.getDescription() + " costs: " + coffe.cost());
    }
}
