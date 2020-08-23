package p28Visitor;

public class Element1 implements Element {

    private String message;

    public Element1(String message) {
        this.message = message;
    }

    public void showMessage() {
        System.out.println("Message: " + message);
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

}