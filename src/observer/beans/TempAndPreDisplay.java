package observer.beans;


import observer.service.DisplayElement;
import observer.service.Observer;
import observer.service.Subject;

/**
 * 温度压力布告板
 */
public class TempAndPreDisplay implements Observer,DisplayElement {

    private float temp;
    private float pressure;
    private Subject weatherDate;

    @Override
    public void display() {
        System.out.println("温度压力布告板:"+ "温度为:" + temp + "℃，压力为:" + pressure);
    }

    public TempAndPreDisplay(Subject weatherDate) {
        this.weatherDate = weatherDate;
        weatherDate.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.pressure = pressure;
        display();
    }
}
