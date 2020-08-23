package p25NullObject;

public class NullCustomer extends AbstractCustomer {
    public NullCustomer() {
        this.name = "NULL CUSTOMER";
    }

    @Override
    public boolean isNull() {
        return true;
    }
}
