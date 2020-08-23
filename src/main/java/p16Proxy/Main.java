package p16Proxy;

public class Main {
    public static void main(String[] args) {
        I i = new ProxyImplementorI();
        if(Math.random() > 0.5) {
            i.f();
        }
    }
}
