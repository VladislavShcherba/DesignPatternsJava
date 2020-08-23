package p13Decorator;

public class DecoratorB extends BaseDecorator {

    public DecoratorB(Interface inner) {
        super(inner);
    }

    @Override
    public void action() {
        super.action();
        extraAction();
    }

    private void extraAction() {
        System.out.println("DecoratorB::extraAction()");
    }
}
