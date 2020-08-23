package p17ChainOfResponsibility;

public class Handler1 extends AbstractHandler {
    @Override
    public boolean handle(Query query) {
        if(query.getType() == 1) {
            System.out.println("Handler1 handled Query{type=1}");
            return true;
        } else {
            return super.handle(query);
        }
    }
}
