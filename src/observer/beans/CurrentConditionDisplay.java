package observer.beans;


import observer.service.DisplayElement;
import observer.service.Observer;
import observer.service.Subject;

/**
 * 温度湿度布告板
 */
public class CurrentConditionDisplay implements Observer,DisplayElement {

    private float temp;
    private float humidity;
    private Subject weatherDate;

    @Override
    public void display() {
        System.out.println("温度湿度布告板:"+ "温度为:" + temp + "℃，湿度为:" + humidity);
    }

    public CurrentConditionDisplay(Subject weatherDate) {
        this.weatherDate = weatherDate;
        weatherDate.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        display();
    }
}
