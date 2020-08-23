package p22Momento;

public class Main {
    public static void main(String[] args) {
        Originator o = new Originator();
        System.out.println(o);
        Originator.Momento m = o.snapshot();
        o.changeState();
        System.out.println(o);
        m.restore();
        System.out.println(o);
    }
}
