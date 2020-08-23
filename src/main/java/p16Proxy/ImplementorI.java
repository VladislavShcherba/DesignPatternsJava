package p16Proxy;

public class ImplementorI implements I {

    public ImplementorI() {
        System.out.println("Long working ImplementorI() constructor");
    }
    @Override
    public void f() {
        System.out.println("ImplementorI::f()");
    }
}
