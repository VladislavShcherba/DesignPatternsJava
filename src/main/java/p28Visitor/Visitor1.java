package p28Visitor;

public class Visitor1 implements Visitor {
    @Override
    public void visit(Element1 e1) {
        e1.showMessage();
    }

    @Override
    public void visit(Element2 e2) {
        e2.showNum();
    }
}