package observer;
import java.util.ArrayList;

public class WeatherService implements Subject{
    
    //vars
    ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;
    
    //constructor
    public WeatherService(){
        observers = new ArrayList();
    }
    public void registerObserver(Observer o){
        observers.add(o);
    }
    public void removeObserver(Observer o){
        int index = observers.indexOf(o);
        if(index >=0) observers.remove(index);
    }
    public void notifyObservers(){
        for (int i = 0; i < observers.size(); i++) {
            Observer observer =  (Observer) observers.get(i);
            observer.update(temperature,humidity,pressure);
        }
    }
    public void measurementsChanged(){
        notifyObservers();
    }
    public void setMeasurements(float temp, float hum, float press){
        this.temperature = temp;
        this.humidity = hum;
        this.pressure = press;
        measurementsChanged();
    }
}