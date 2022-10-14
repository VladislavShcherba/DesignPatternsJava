package p22Memento;

public class Main {
    public static void main(String[] args) {
        Originator o = new Originator();
        System.out.println(o);
        Originator.Memento m = o.snapshot();
        o.changeState();
        System.out.println(o);
        m.restore();
        System.out.println(o);
    }
}
