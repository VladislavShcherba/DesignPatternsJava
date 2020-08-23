package p10Bridge;

public class Main {
    public static void main(String[] args) {
        Implementation i1 = new I1();
        Implementation i2 = new I2();
        A1 a1 = new A1(i1);
        A2 a2 = new A2(i1);
        a1.a1();
        a2.a2();
        a2.setI(i2);
        a2.a1();
    }
}
