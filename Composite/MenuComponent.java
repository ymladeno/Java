import java.util.Iterator;

public interface MenuComponent {
    public void add(MenuComponent menuComponent);
    public Iterator<MenuComponent> createIterator();

    public String getName();
    public String getDescription();
    public boolean isVegetarian();
    public double getPrice();

    public void print();
}
