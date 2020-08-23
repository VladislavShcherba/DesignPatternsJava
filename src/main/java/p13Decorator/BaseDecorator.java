package p13Decorator;

public class BaseDecorator implements Interface {
    private Interface inner;

    public BaseDecorator(Interface inner) {
        this.inner = inner;
    }

    @Override
    public void action() {
        inner.action();
    }
}
