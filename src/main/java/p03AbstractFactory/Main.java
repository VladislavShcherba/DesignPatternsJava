package p03AbstractFactory;

public class Main {
    public static void main(String[] args) {
        A a = new FactoryProducer().getAFactory("B").getA(2);
    }
}
