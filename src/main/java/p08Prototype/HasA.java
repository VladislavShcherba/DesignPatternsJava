package p08Prototype;

public class HasA implements Cloneable {
    private A a;
    public HasA(A a) {
        this.a = a;
    }
    public A getA() {
        return a;
    }
    public void setA(A a) {
        this.a = a;
    }
    @Override
    public HasA clone() throws CloneNotSupportedException {
        HasA cloned = (HasA) super.clone();
        cloned.a = cloned.a.clone();
        return cloned;
    }
}
