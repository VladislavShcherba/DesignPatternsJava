package p16Proxy;

//can be used for:
//lazy init, access protection, logging, cache, local service launch...
public class ProxyImplementorI implements I {
    private I i;

    @Override
    public void f() {
        System.out.println("Log: ProxyImplementorI::f()");
        if(i == null) {
            i = new ImplementorI();
            i.f();
        }
    }
}
