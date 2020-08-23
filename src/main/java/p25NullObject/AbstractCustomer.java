package p25NullObject;

public abstract class AbstractCustomer {
    protected String name;

    public String getName() {
        return name;
    }

    public abstract boolean isNull();
}
