package p13Decorator;

public class DecoratorA extends BaseDecorator {

    public DecoratorA(Interface inner) {
        super(inner);
    }

    @Override
    public void action() {
        super.action();
        extraAction();
    }

    private void extraAction() {
        System.out.println("DecoratorA::extraAction()");
    }

}
