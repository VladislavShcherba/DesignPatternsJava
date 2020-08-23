package p24State;

public class State2 implements State {

    private Context context;

    public State2(Context context) {
        this.context = context;
    }

    @Override
    public void doAction() {
        System.out.println("State2::doAction()");
        context.setState(new State1(context));
    }
}