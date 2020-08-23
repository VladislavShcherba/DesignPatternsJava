package p03AbstractFactory;

public class AAFactory extends AAbstractFactory {
    @Override
    public A getA(int which) {
        switch (which) {
            case 1: return new AA1();
            case 2: return new AA2();
            default: return null;
        }
    }
}
