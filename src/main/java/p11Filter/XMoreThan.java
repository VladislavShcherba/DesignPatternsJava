package p11Filter;

public class XMoreThan implements Criteria {

    private double minimumX;

    public XMoreThan(double minimumX) {
        this.minimumX = minimumX;
    }

    @Override
    public boolean isOk(A a) {
        return a.getX() > minimumX;
    }
}
