package p21Mediator;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        Mediator m = new ConcreteMediator(a,b,c);
        a.setMediator(m);
        b.setMediator(m);
        c.setMediator(m);

        a.doOperation("param1");
        b.doOperation("param1");
        c.doOperation("param1");
    }
}
