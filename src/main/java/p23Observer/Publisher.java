package p23Observer;

public interface Publisher {
    public void subscribe(Subscriber subscriber, String event);
    public void unsubscribe(Subscriber subscriber, String event);
    public void notifySubscribers(String event, String parameter);
}
