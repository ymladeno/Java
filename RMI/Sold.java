public class Sold extends State {
    transient GumballMachine context;

    @Override
    public void insertQuarter() {
        System.out.println("Gumball was sold. Please wait");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("There is no quarter. Gumball is already sold. Please wait");
    }

    @Override
    public void turnCrack() {
        System.out.println("Turn crack. Turning crack twice won't give you a second gumball");
    }

    @Override
    public void dispence() {
        System.out.println("Sold");
        context.releaseGumball();
        if (context.getGumballsCounter() > 0) {
            context.setState(context.getNoQuarterState());
        } else {
            context.setState(context.getSoldOutState());
        }
    }

    Sold(GumballMachine context) { this.context = context; }
}
