public class IteratorDinerMenu implements IteratorMenu {
    int position = 0;
    MenuItem[] menuItems;

    IteratorDinerMenu(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if (position >= menuItems.length) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public MenuItem next() {
        return menuItems[position++];
    }
}
