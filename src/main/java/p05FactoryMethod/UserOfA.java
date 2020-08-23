package p05FactoryMethod;

public abstract class UserOfA {
    public void use() {
        A a = getA();
        a.f();
    }

    public abstract A getA();
}
