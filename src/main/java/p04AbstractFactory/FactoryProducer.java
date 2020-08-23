package p04AbstractFactory;

public class FactoryProducer {
    public AbstractFactory getFactory1() {
        return new Factory1();
    }
    public AbstractFactory getFactory2() {
        return new Factory2();
    }
}
