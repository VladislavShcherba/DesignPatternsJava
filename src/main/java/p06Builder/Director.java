package p06Builder;

public class Director {
    public void construct11(Builder builder){
        builder.setA(new A1());
        builder.setB(new B1());
    }
    public void construct12(Builder builder){
        builder.setA(new A1());
        builder.setB(new B2());
    }
    public void construct21(Builder builder){
        builder.setA(new A2());
        builder.setB(new B1());
    }
    public void construct22(Builder builder){
        builder.setA(new A2());
        builder.setB(new B2());
    }
}
