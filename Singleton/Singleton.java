public class Singleton {
    private static Singleton instance;
    private String name;

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    String getName() { return name; }
    void setName(String name) { this.name = name; }
    private Singleton() {};
}
