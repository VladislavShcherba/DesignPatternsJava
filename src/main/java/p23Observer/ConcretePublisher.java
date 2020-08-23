package p23Observer;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ConcretePublisher implements Publisher {

    private Map<String, Set<Subscriber>> subscribersMap;

    public ConcretePublisher() {
        subscribersMap = new HashMap<>();
    }

    @Override
    public void subscribe(Subscriber subscriber, String event) {
        Set<Subscriber> subscribers = subscribersMap.get(event);
        if ( subscribers != null ) {
            subscribers.add(subscriber);
        } else {
            Set<Subscriber> subscribersNew = new HashSet<>();
            subscribersNew.add(subscriber);
            subscribersMap.put(event,subscribersNew);
        }
    }

    @Override
    public void unsubscribe(Subscriber subscriber, String event) {
        Set<Subscriber> subscribers = subscribersMap.get(event);
        if( subscribers != null ) {
            subscribers.remove(subscriber);
        }
    }

    @Override
    public void notifySubscribers(String event, String parameter) {
        Set<Subscriber> subscribers = subscribersMap.get(event);
        if( subscribers != null ) {
            subscribers.forEach(s -> s.notify(parameter));
        }
    }
}
