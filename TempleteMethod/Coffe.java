public class Coffe extends CaffeineBeverage {
    @Override
    public void brew() {
        System.out.println("Brew coffe");
    }

    @Override
    public void addCondiments() {
        System.out.println("Add sugar and milk");
    }

    @Override
    public boolean clientWantsCondiments() {
        System.out.println("Would you like sugar and milk");
        return false;
    }
}
