package p24State;

public class Main {
    public static void main(String[] args) {
        Context context = new ConcreteContext();
        context.doAction();
        context.doAction();
        context.doAction();
        context.doAction();
    }
}
