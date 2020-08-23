package p01Factory;

public class AFactory {
    public A getA(int which) {
        switch (which) {
            case 1: return new A1();
            case 2: return new A2();
            default: return null;
        }
    }
}
