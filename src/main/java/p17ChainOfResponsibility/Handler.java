package p17ChainOfResponsibility;

public interface Handler {
    boolean handle(Query query);
    void setNext(Handler next);
}
