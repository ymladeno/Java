import java.util.ArrayList;

public class PancakeMenu implements Menu {
    ArrayList<MenuItem> menuItems;
    String name;
    String description;
    boolean vegetarian;
    double price;

    @Override
    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    public PancakeMenu() {
        menuItems = new ArrayList<MenuItem>();
    }

    @Override
    public IteratorMenu createIterator() {
        return new IteratorPancakeMenu(menuItems);
    }
}