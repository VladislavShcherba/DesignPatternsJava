package p23Observer;

public class Main {
    public static void main(String[] args) {
        Subscriber s1, s2, s3;
        s1 = new ConcreteSubscriber("s1");
        s2 = new ConcreteSubscriber("s2");
        s3 = new ConcreteSubscriber("s3");
        String event1 = "event1", event2 = "event2";

        Publisher p = new ConcretePublisher();
        p.subscribe(s1, event1);
        p.subscribe(s2, event1);
        p.subscribe(s2, event2);
        p.subscribe(s3, event2);

        p.notifySubscribers(event1, "param1");
        p.notifySubscribers(event2, "param2");
    }
}
