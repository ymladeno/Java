public class DisplayCurrent implements Listener {
    public void update(float temperature, float humidity) {
        System.out.println("Update current display");
    }

    DisplayCurrent(Subject subject) {
        subject.subscribe(this);
    }
}