package p03AbstractFactory;

public class ABFactory extends AAbstractFactory {
    @Override
    public A getA(int which) {
        switch (which) {
            case 1: return new AB1();
            case 2: return new AB2();
            default: return null;
        }
    }
}
