public class BeverageTest {
    public static void main(String[] args) {
        CaffeineBeverage tea = new Tea();
        tea.prepare();

        System.out.println();

        CaffeineBeverage coffe = new Coffe();
        coffe.prepare();
    }    
}
