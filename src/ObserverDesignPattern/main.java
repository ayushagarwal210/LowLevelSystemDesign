package ObserverDesignPattern;

import ObserverDesignPattern.Implementation.EmailNotifyImpl;
import ObserverDesignPattern.Implementation.MobileNotifyImpl;
import ObserverDesignPattern.Implementation.WeatherObservableImpl;

public class main {
    public static void main(String[] args) {
        WeatherObservable observable=new WeatherObservableImpl();
        DisplayObserver mobileObserver=new MobileNotifyImpl("9354881764",observable);
        DisplayObserver emailObserver=new EmailNotifyImpl("ayush.agarwal.ggn@gmail.com",observable);
        observable.add(mobileObserver);
        observable.add(emailObserver);
        observable.setTemperature((float)99.60);
        observable.getTempararture();
        observable.setTemperature((float)100.60);
        observable.getTempararture();
        observable.setTemperature((float)101.60);
        observable.getTempararture();
    }
}
