public class HasQuarter extends State {
    GumballMachine context;

    @Override
    public void insertQuarter() {
        System.out.println("Insert quarter. Can't insert second quarter. Please turn the crack");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Eject quarter");
        context.setState(context.getNoQuarterState());
    }

    @Override
    public void turnCrack() {
        System.out.println("Turn crack");
        context.setState(context.getSoldState());
    }

    HasQuarter(GumballMachine context) {
        this.context = context;
    }
}
