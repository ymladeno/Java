public class Light {
    private String location;

    public void on() {
        System.out.println("Swith " + location + " on!");
    }

    public void off() {
        System.out.println("Swith " + location + " off!");
    }

    Light(String location) { this.location = location; }
}
