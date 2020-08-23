package p09Adapter;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        FClass f = new FClass();
        GClass g = new GClass();
        Adapter adapter = new Adapter();
        g.g(adapter.bToC(f.f(a)));
    }
}
