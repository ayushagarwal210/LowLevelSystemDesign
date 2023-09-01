package ObserverDesignPattern.Implementation;

import ObserverDesignPattern.DisplayObserver;
import ObserverDesignPattern.WeatherObservable;

public class EmailNotifyImpl implements DisplayObserver {
    String email;
    WeatherObservable observer;
    public EmailNotifyImpl(String email,WeatherObservable observer){
        this.email=email;
        this.observer=observer;
    }
    @Override
    public void update() {
        sendEmail(email,"Temparature has increased");
    }

    private void sendEmail(String email, String temparatureHasIncreased) {
        System.out.println("mail sent to: "+email);
    }
}
