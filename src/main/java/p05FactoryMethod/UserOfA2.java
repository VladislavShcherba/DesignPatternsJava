package p05FactoryMethod;

public class UserOfA2 extends UserOfA {
    @Override
    public A getA() {
        return new A2();
    }
}
