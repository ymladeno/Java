public interface Menu {
    public void addItem(String name, String description, boolean vegetarian, double price);
    public IteratorMenu createIterator();
}
