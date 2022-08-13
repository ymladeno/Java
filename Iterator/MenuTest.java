import java.util.ArrayList;

public class MenuTest {
    public static void main(String[] args) {
        DinerMenu dinerMenu = new DinerMenu();

        dinerMenu.addItem("Vegetarian BLT", "Fakin Bacon with lettuce and tomato", true, 2.99);
        dinerMenu.addItem("Bacon", "Bacon with lettuce and tomato", false, 2.99);
        dinerMenu.addItem("Chicken soup", "Chicken soup with tomato", false, 1.99);
        dinerMenu.addItem("Hotdog", "Hot dog with ketcup, relish, onions", false, 0.99);


        System.out.println("====== DINER MENU =======\n");
        MenuItem[] dinerMenuItems = dinerMenu.getMenuItems();
        for(int i = 0; i < dinerMenuItems.length; ++i) {
            dinerMenuItems[i].print();
            // System.out.println(menuItems[i].getName() + " " );
        }
        System.out.println();

        PancakeMenu pancakeMenu = new PancakeMenu();

        pancakeMenu.addItem("Blueberry pancake", "Pancake made with fresh blueberries", true, 3.49);
        pancakeMenu.addItem("Waffles", "Waffles with white and browb chocolate", true, 3.59);
        pancakeMenu.addItem("Regular breakfast", "Fried eggs, sausage", true, 2.99);

        System.out.println("====== PANCAKE MENU =======\n");
        ArrayList<MenuItem> pancakeMenuItems = pancakeMenu.getMenuItems();
        for(int i = 0; i < pancakeMenuItems.size(); ++i) {
            MenuItem menuItem = pancakeMenuItems.get(i);
            menuItem.print();
            // System.out.println(menuItems[i].getName() + " " );
        }
        System.out.println();
    }    
}
