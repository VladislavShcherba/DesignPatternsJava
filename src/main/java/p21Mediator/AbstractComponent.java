package p21Mediator;

public class AbstractComponent implements Component {
    private Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void doOperation(String parameter) {
        mediator.notify(this, parameter);
    }

}
