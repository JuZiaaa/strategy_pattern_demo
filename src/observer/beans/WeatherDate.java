package observer.beans;

import observer.service.Observer;
import observer.service.Subject;

import java.util.ArrayList;

/**
 * 气象观测值实体类
 */
public class WeatherDate implements Subject {

    private float temp;
    private float humidity;
    private float pressure;
    private ArrayList observers;

    public WeatherDate() {
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int index = observers.indexOf(observer);
        if(index >=0 ){
            observers.remove(index);
        }
    }

    @Override
    public void notifyObserver() {
        if(null != observers && observers.size()>0){
            for (int i = 0; i < observers.size(); i++){
                Observer observer = (Observer)observers.get(i);
                observer.update(temp,humidity,pressure);
            }
        }

    }

    /**
     * 当气象发生变化时通知观察者
     * @param temp
     * @param humidity
     * @param pressure
     */
    public void setMeasurements(float temp,float humidity,float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObserver();
    }
}
