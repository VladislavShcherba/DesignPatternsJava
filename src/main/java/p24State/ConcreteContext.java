package p24State;

public class ConcreteContext implements Context {

    private State state;

    public ConcreteContext() {
        state = new State1(this);
    }

    @Override
    public void setState(State state) {
        this.state = state;
    }

    @Override
    public void doAction() {
        state.doAction();
    }
}