package observer.beans;


import observer.service.DisplayElement;
import observer.service.Observer;
import observer.service.Subject;

/**
 * 湿度压力布告板
 */
public class HumAndPreDisplay implements Observer,DisplayElement {

    private float pressure;
    private float humidity;
    private Subject weatherDate;

    @Override
    public void display() {
        System.out.println("湿度压力布告板:"+ "压力为:" + pressure + "，湿度为:" + humidity);
    }

    public HumAndPreDisplay(Subject weatherDate) {
        this.weatherDate = weatherDate;
        weatherDate.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }
}
