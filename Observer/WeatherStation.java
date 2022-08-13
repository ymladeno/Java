public class WeatherStation {
    public static void main(String[] args) {
        WeatherData data = new WeatherData();

        Listener displayCurrent = new DisplayCurrent(data);
        data.setMeasurements();

        Listener displayForecast = new DisplayForecast(data);
        data.setMeasurements();
    }
}
