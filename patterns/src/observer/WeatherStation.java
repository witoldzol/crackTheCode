package observer;

public class WeatherStation{
    
    public static void main(String[] args) {
        //objects
        WeatherService weatherservice = new WeatherService();
        CurrentConditionsDisplay ccdisplay = new CurrentConditionsDisplay(weatherservice);
        
        //set measurements
        weatherservice.setMeasurements(10, 30, 18.18f);
        weatherservice.setMeasurements(30, 12.3f, 11.2f);
    }
    
}