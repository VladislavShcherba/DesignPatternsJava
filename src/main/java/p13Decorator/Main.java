package p13Decorator;

public class Main {
    public static void main(String[] args) {
        Interface i = new DecoratorA(new BaseImplementor());
        i.action();
        i = new DecoratorB(new DecoratorA(new BaseImplementor()));
        i.action();
    }
}
