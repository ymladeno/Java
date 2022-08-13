public class SingletonTest {
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();

        s.setName("My Singleton");

        Singleton s1 = Singleton.getInstance();

        System.out.println(s1.getName());
    }
}
