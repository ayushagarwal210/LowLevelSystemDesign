package ObserverDesignPattern;

public interface WeatherObservable {
    public void add(DisplayObserver obj);
    public void remove(DisplayObserver obj);
    public void notifyMe();
    public void setTemperature(float data);
    public void getTempararture();
}
