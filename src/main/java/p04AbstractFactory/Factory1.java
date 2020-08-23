package p04AbstractFactory;

public class Factory1 extends AbstractFactory {
    @Override
    public A getA() {
        return new A1();
    }

    @Override
    public B getB() {
        return new B1();
    }
}
