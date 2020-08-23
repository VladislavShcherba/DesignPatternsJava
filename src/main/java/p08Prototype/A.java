package p08Prototype;

public class A implements Cloneable {
    private int x;
    public A(int x) {
        this.x = x;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    @Override
    public A clone() throws CloneNotSupportedException {
        return (A) super.clone();
    }
}