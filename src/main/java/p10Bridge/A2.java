package p10Bridge;

public class A2 implements Abstraction {

    private Implementation i;

    public A2(Implementation i) {
        this.i = i;
    }

    public void setI(Implementation i) {
        this.i = i;
    }

    @Override
    public void a1() {
        i.i1();
        i.i1();
    }

    @Override
    public void a2() {
        i.i2();
        i.i2();
    }

}
