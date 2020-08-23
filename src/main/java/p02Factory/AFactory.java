package p02Factory;

public class AFactory {
    public A getA1() {
        return new A1();
    }
    public A getA2() {
        return new A2();
    }
}
