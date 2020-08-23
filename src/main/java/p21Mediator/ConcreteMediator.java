package p21Mediator;

public class ConcreteMediator implements Mediator {

    private A a;
    private B b;
    private C c;

    public ConcreteMediator(A a, B b, C c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public void notify(Component component, String parameter) {
        if(component == a) {
            System.out.println("Component a, parameter " + parameter);
            a.actionA();
            b.actionB();
        } else if(component == b) {
            System.out.println("Component b, parameter " + parameter);
            b.actionB();
            c.actionC();
        } else {
            System.out.println("Component c, parameter " + parameter);
            c.actionC();
            a.actionA();
        }
    }

}
