public class GumballMachineTest {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(2);

        gumballMachine.turnCrack();
        gumballMachine.ejectQuarter();
        gumballMachine.insertQuarter();
        gumballMachine.insertQuarter();
        System.out.println(gumballMachine);
        gumballMachine.turnCrack();
        System.out.println(gumballMachine);
        gumballMachine.turnCrack();
        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.ejectQuarter();
        gumballMachine.turnCrack();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrack();

        gumballMachine.insertQuarter();
        gumballMachine.turnCrack();

        gumballMachine.fillin(1);

        gumballMachine.turnCrack();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrack();
    }    
}
