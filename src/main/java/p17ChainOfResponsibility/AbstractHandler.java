package p17ChainOfResponsibility;

public class AbstractHandler implements Handler {

    private Handler next;

    @Override
    public boolean handle(Query query) {
        if(next != null) {
            return next.handle(query);
        }
        return false;
    }

    @Override
    public void setNext(Handler next) {
        this.next = next;
    }

}
