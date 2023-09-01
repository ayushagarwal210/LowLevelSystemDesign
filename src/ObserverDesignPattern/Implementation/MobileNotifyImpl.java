package ObserverDesignPattern.Implementation;

import ObserverDesignPattern.DisplayObserver;
import ObserverDesignPattern.WeatherObservable;

public class MobileNotifyImpl implements DisplayObserver{
    String mobileNumber;
    WeatherObservable observer;

    public MobileNotifyImpl(String mobileNumber,WeatherObservable observer){
        this.mobileNumber=mobileNumber;
        this.observer=observer;
    }

    @Override
    public void update() {
        sendMessage(mobileNumber,"Temparature has increased");
    }

    private void sendMessage(String mobileNumber, String temparatureHasIncreased) {
        System.out.println("Message sent to: "+mobileNumber);
    }

}
