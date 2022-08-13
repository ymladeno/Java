public class Soy extends Condiment {

    @Override
    public String getDescription() {
        return beverage.getDescription() + " + Soy";
    }

    @Override
    public double cost() {
        return 0.10 + beverage.cost();
    }

    Soy(Beverage beverage) { this.beverage = beverage; }

    private Beverage beverage;
}
