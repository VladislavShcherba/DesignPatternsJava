package p17ChainOfResponsibility;

public class Handler3 extends AbstractHandler {
    @Override
    public boolean handle(Query query) {
        if(query.getType() == 3) {
            System.out.println("Handler3 handled Query{type=3}");
            return true;
        } else {
            return super.handle(query);
        }
    }
}