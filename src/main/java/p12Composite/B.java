package p12Composite;

public class B implements Component {
    @Override
    public int getValue() {
        return 20;
    }
    @Override
    public boolean add(Component component) {
        return false;
    }
}
