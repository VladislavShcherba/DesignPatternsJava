package p11Filter;

public class YLessThan implements Criteria {

    private double maximumY;

    public YLessThan(double maximumY) {
        this.maximumY = maximumY;
    }

    @Override
    public boolean isOk(A a) {
        return a.getY() < maximumY;
    }
}
