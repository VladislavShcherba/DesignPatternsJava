package p04AbstractFactory;

public class Factory2 extends AbstractFactory {
    @Override
    public A getA() {
        return new A2();
    }

    @Override
    public B getB() {
        return new B2();
    }
}
