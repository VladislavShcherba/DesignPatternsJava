package p17ChainOfResponsibility;

public class Handler2 extends AbstractHandler {
    @Override
    public boolean handle(Query query) {
        if(query.getType() == 2) {
            System.out.println("Handler2 handled Query{type=2}");
            return true;
        } else {
            return super.handle(query);
        }
    }
}