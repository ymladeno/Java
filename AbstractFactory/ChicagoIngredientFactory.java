public class ChicagoIngredientFactory implements AbstractIngredientFactory {
    @Override
    public Dough createDough() {
        System.out.println("Create Chicago dough");
        return new ChicagoDough();
    }

    @Override
    public Sauce createSauce() {
        System.out.println("Create Chicago sauce");
        return new ChicagoSauce();
    }

    @Override
    public Cheese createCheese() {
        System.out.println("Create Chicago cheese");
        return new ChicagoCheese();
    }  
}
