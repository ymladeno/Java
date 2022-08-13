public abstract class CaffeineBeverage {
    public final void prepare() {
        boilWater();
        brew();
        pourInCup();
        if (clientWantsCondiments()) {
            addCondiments();
        }
    }

    private void boilWater() {
        System.out.println("Boil some water");
    }

    private void pourInCup() {
        System.out.println("Pour in a cup");
    }

    public boolean clientWantsCondiments() {
        return true;
    }

    public abstract void brew();
    public abstract void addCondiments();
}
