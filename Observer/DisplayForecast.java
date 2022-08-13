public class DisplayForecast implements Listener {
    public void update(float temperature, float humidity) {
        System.out.println("Update forecast display");
    }

    DisplayForecast(Subject subject) {
        subject.subscribe(this);
    }
}