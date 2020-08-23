package p24State;

public interface Context extends State {
    void setState(State state);
}