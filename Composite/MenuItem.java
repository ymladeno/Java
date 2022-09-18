import java.util.Iterator;

public class MenuItem implements MenuComponent {
    String name;
    String description;
    boolean vegetarian;
    double price;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public String getName() { return name; }
    public String getDescription() { return description; }
    public boolean isVegetarian() { return vegetarian; }
    public double getPrice() { return price; }

    public String toString() {
        return name + "\n\t" + description + "\t\t" + price;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Iterator<MenuComponent> createIterator() {
        return new NullIterator();
    }

    @Override
    public void print() {
        System.out.println(name + "\n\t" + description + "\t\t" + price);
    }
}
