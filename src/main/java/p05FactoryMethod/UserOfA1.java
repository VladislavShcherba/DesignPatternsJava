package p05FactoryMethod;

public class UserOfA1 extends UserOfA {
    @Override
    public A getA() {
        return new A1();
    }
}
