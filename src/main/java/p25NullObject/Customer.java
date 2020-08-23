package p25NullObject;

public class Customer extends AbstractCustomer {
    public Customer(String name) {
        this.name = name;
    }

    @Override
    public boolean isNull() {
        return false;
    }
}
