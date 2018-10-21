
import java.util.ArrayList;
import java.util.Observable;

class WeatherStation extends Observable{
    //vars
    private int data;

    //constructor - no need to create list
    public WeatherStation(){}

    //methods
    public void measurementsChanged(){
        //we have to call it before sending update
        setChanged();
        //we are not sending data with notification
        //so observers can pull only data they really need
        notifyObservers();
    }
    public void setMeasurements(int data){
        this.data = data;
    }
    //observers will use getters to pull data they need
    public int getData(){return data;}
    
}