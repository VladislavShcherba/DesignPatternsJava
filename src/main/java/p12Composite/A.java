package p12Composite;

public class A implements Component {
    @Override
    public int getValue() {
        return 10;
    }
    @Override
    public boolean add(Component component) {
        return false;
    }
}