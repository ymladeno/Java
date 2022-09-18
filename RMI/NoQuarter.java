public class NoQuarter extends State {
    transient GumballMachine context;

    @Override
    public void insertQuarter() {
        System.out.println("Insert quarter");
        context.setState(context.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Eject quarter. There is no quarter");
    }

    @Override
    public void turnCrack() {
        System.out.println("Turned crack. Please insert a quarter");
    }

    NoQuarter(GumballMachine context) {
        this.context = context;
    }
}
