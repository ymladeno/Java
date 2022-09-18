import java.util.ArrayList;
import java.util.Iterator;

public class Waitress {
    MenuComponent allMenus;

    public Waitress() {
        MenuComponent dinerMenu = new Menu("Diner menu", "Meat or vegetarian");
        MenuComponent pancakeMenu = new Menu("Pancake menu", "Breakfast");
        MenuComponent dessertMenu = new Menu("Dessert menu", "Dessert whenever you want");

        dessertMenu.add(new MenuItem("Apple pie", "Apple pie with vanilla icecream", true, 1.59));

        dinerMenu.add(new MenuItem("Bacon", "Bacon with lettuce and tomato", false, 2.99));
        dinerMenu.add(new MenuItem("Chicken soup", "Chicken soup with tomato", false, 1.99));
        dinerMenu.add(new MenuItem("Vegetarian BLT", "Fakin Bacon with lettuce and tomato", true, 2.99));
        dinerMenu.add(new MenuItem("Hotdog", "Hot dog with ketcup, relish, onions", false, 0.99));
        dinerMenu.add(dessertMenu);

        pancakeMenu.add(new MenuItem("Blueberry pancake", "Pancake made with fresh blueberries", true, 3.49));
        pancakeMenu.add(new MenuItem("Waffles", "Waffles with white and browb chocolate", true, 3.59));
        pancakeMenu.add(new MenuItem("Regular breakfast", "Fried eggs, sausage", true, 2.99));
     
        allMenus = new Menu("All menus", "All menus here");;
        allMenus.add(dinerMenu);
        allMenus.add(pancakeMenu);
    }

    public void printAllMenus() { allMenus.print(); }

    public void printVegetarianMenu() {
        Iterator<MenuComponent> it = allMenus.createIterator();

        while (it.hasNext()) {
            MenuComponent item = it.next();
            try {
                if (item.isVegetarian()) {
                    item.print();
                }
            } catch(UnsupportedOperationException e) {}
        }
    }
}
