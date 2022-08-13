public class NYIngredientFactory implements AbstractIngredientFactory {

    @Override
    public Dough createDough() {
        System.out.println("Create NY dough");
        return new NYDough();
    }

    @Override
    public Sauce createSauce() {
        System.out.println("Create NY sauce");
        return new NYSauce();
    }

    @Override
    public Cheese createCheese() {
        System.out.println("Create NY cheese");
        return new NYCheese();
    }
}
