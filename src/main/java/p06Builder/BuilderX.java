package p06Builder;

public class BuilderX implements Builder {
    private A a;
    private B b;

    @Override
    public void setA(A a) {
        this.a = a;
    }
    @Override
    public void setB(B b) {
        this.b = b;
    }
    public ObjectX getResult() {
        return new ObjectX(a,b);
    }
}
