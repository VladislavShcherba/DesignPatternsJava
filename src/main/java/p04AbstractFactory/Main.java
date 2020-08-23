package p04AbstractFactory;

public class Main {
    public static void main(String[] args) {
        A a = new FactoryProducer().getFactory1().getA();
    }
}
