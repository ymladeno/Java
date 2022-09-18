public class SoldOut extends State {
    GumballMachine context;

    @Override
    public void insertQuarter() {
        System.out.println("Can't instert a quarter. There are no gumballs");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Can't eject a quarter. There are no quarter");
    }

    @Override
    public void turnCrack() {
        System.out.println("You turn the crack, but first insert a quarter");
    }

    @Override
    public void fillin(int count) {
        if (count > 0) {
            context.setState(context.getNoQuarterState());
        }
    }

    SoldOut(GumballMachine context) {
        this.context = context;
    }
}
