import java.util.ArrayList;
import java.util.Iterator;

public class Menu implements MenuComponent {
    ArrayList<MenuComponent> menuItems;
    String name;
    String description;
    CompositeIterator it;

    @Override
    public void add(MenuComponent newMenuComponent) {
        menuItems.add(newMenuComponent);
    }

    public Menu(String name, String description) {
        menuItems = new ArrayList<MenuComponent>();

        this.name = name;
        this.description = description;
    }

    @Override
    public Iterator<MenuComponent> createIterator() {
        if (it == null) {
            it = new CompositeIterator(menuItems.iterator());
        }
        return it;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public boolean isVegetarian() {
        throw new UnsupportedOperationException();
    }

    @Override
    public double getPrice() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void print() {
        Iterator<MenuComponent> iterator = createIterator();
        
        System.out.println(" === " + name + " ==== ");
        while (iterator.hasNext()) {
            MenuComponent item = (MenuComponent)iterator.next();
            item.print();
        }

        System.out.println();
    }
}