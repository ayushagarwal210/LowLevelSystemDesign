package ObserverDesignPattern.Implementation;

import ObserverDesignPattern.DisplayObserver;
import ObserverDesignPattern.WeatherObservable;

import java.util.ArrayList;
import java.util.List;

public class WeatherObservableImpl implements WeatherObservable {
    List<DisplayObserver> list=new ArrayList<>();
    float temperature;
    public void add(DisplayObserver obj){
        list.add(obj);
    }

    @Override
    public void remove(DisplayObserver obj) {
        list.remove(obj);
    }

    @Override
    public void notifyMe() {
        for(DisplayObserver obj:list){
            obj.update();
        }
    }

    @Override
    public void setTemperature(float newTemperature) {
        if(newTemperature>temperature){
            notifyMe();
        }
        temperature=newTemperature;
    }

    @Override
    public void getTempararture() {
        System.out.println(temperature);
    }
}
