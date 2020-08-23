package p28Visitor;

public class Element2 implements Element {

    private int num;

    public Element2(int num) {
        this.num = num;
    }

    public void showNum() {
        System.out.println(num);
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}