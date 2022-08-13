public class Milk extends Condiment {

    @Override
    public String getDescription() {
        return beverage.getDescription() + " + Milk";
    }

    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }
    
    Milk(Beverage beverage) { this.beverage = beverage; }

    private Beverage beverage;
}
