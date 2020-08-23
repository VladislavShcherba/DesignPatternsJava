package p21Mediator;

public interface Component {
    void setMediator(Mediator mediator);
    void doOperation(String parameter);
}
