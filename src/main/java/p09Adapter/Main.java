package p09Adapter;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        IClient client = new Adapter();
        C c = client.process(a);
    }
}
