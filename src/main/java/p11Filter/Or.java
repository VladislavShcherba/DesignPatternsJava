package p11Filter;

public class Or implements Criteria {

    private Criteria criteria1, criteria2;

    public Or(Criteria criteria1, Criteria criteria2) {
        this.criteria1 = criteria1;
        this.criteria2 = criteria2;
    }

    @Override
    public boolean isOk(A a) {
        return criteria1.isOk(a) || criteria2.isOk(a);
    }
}
