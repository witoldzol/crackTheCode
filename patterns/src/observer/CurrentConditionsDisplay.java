package observer;
public class CurrentConditionsDisplay implements Observer, DisplayElement{
    //vars
    private float temperature;
    private float pressure;
    private Subject weatherData;
    
    //constructor
    public CurrentConditionsDisplay(Subject weatherData){
        this.weatherData = weatherData;
        //since this is a constructor, when we create this object
        //we should subscribe it as an observer
        weatherData.registerObserver(this);
    }
    
    public void update(float temp, float humid, float press){
        this.temperature = temp;
        this.pressure = press;
        display();
    }
    
    public void display(){
        System.out.println("CURRENT CONDITIONS DISPLAY\nTemp is " + temperature + "\n"+ "Current pressure is at "+ pressure);
    }
}