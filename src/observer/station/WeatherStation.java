package observer.station;

import observer.beans.CurrentConditionDisplay;
import observer.beans.HumAndPreDisplay;
import observer.beans.TempAndPreDisplay;
import observer.beans.WeatherDate;

public class WeatherStation {

    //创建主题
    private static WeatherDate weatherDate = new WeatherDate();

    public static void main(String[] args) {

        //创建观察者
        //创建温度湿度布告板
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherDate);
        //创建湿度压力布告板
        new HumAndPreDisplay(weatherDate);
        //创建湿度压力布告板
        new TempAndPreDisplay(weatherDate);

        weatherDate.setMeasurements(11,12,13);
        System.out.println("天气发生改变");
        System.out.println("温度湿度布告板关闭");
        weatherDate.removeObserver(currentConditionDisplay);
        System.out.println("================");
        weatherDate.setMeasurements(555,666,777);
        System.out.println("天气再次发生改变");
        System.out.println("================");
        System.out.println("(!(~+[])+{})[--[~+\"\"][+[]]*[~+[]]+~~!+[]]+({}+[])[[~!+[]]*~+[]]");
        weatherDate.setMeasurements(-555,-666,-777);
    }
}
