package p12Composite;

public class Main {
    public static void main(String[] args) {
        Composite c1 = new Composite();
        Composite c2 = new Composite();
        c1.add(new A());
        c1.add(new B());
        c1.add(c2);
        c2.add(new A());
        System.out.println(c1.getValue());
    }
}
