package p28Visitor;

public class Main {
    public static void main(String[] args) {
        Visitor v = new Visitor1();
        new Element1("Hi").accept(v);
        new Element2(123).accept(v);

    }
}
