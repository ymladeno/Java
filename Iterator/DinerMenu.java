public class DinerMenu implements Menu {
    MenuItem[] menuItems;
    static final int MAX_SIZE = 4;
    int position = 0;

    DinerMenu() { menuItems = new MenuItem[MAX_SIZE]; }

    @Override
    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems[position] = menuItem;
        ++position;
    }

    @Override
    public IteratorMenu createIterator() {
        return new IteratorDinerMenu(menuItems);
    }
}
