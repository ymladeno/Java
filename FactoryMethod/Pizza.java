public abstract class Pizza {
    String name;
    public abstract void prepare();
    public abstract void bake();
    public abstract void cut();
    public abstract void box();
    public String name() { return name; }
    Pizza(String name) { this.name = name; }
}
