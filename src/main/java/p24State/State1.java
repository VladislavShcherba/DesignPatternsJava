package p24State;

public class State1 implements State {

    private Context context;

    public State1(Context context) {
        this.context = context;
    }

    @Override
    public void doAction() {
        System.out.println("State1::doAction()");
        context.setState(new State2(context));
    }
}