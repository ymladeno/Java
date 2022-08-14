import java.util.ArrayList;

public class IteratorPancakeMenu implements IteratorMenu {
    ArrayList<MenuItem> menuItems;
    int position = 0;

    public IteratorPancakeMenu(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if (position >= menuItems.size()) {
            return false;

        } else {
            return true;
        }
    }

    @Override
    public MenuItem next() {
        return menuItems.get(position++);
    }
}
