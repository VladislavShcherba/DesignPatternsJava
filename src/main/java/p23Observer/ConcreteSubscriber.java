package p23Observer;

public class ConcreteSubscriber implements Subscriber {

    private String name;

    public ConcreteSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void notify(String parameter) {
        System.out.println("Subscriber with name " + name + " notified with parameter " + parameter);
    }
}
