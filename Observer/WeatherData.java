import java.util.ArrayList;

public class WeatherData implements Subject {
    private ArrayList<Listener> listeners;
    private float temperature;
    private float humidity;

    public void subscribe(Listener l) { listeners.add(l); }
    public void unsubscribe(Listener l) { listeners.remove(l); }
    public void notify_all() {
        for (Listener l : listeners) {
            l.update(temperature, humidity);
        }
    }
    public void setMeasurements() { notify_all(); }
    public WeatherData() {
        listeners = new ArrayList<Listener>();
    }
}