package p12Composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {

    private List<Component> componentList;

    public Composite() {
        componentList = new ArrayList<>();
    }

    @Override
    public int getValue() {
        int value = 0;
        for(Component component : componentList) {
            value += component.getValue();
        }
        return value;
    }

    @Override
    public boolean add(Component component) {
        return componentList.add(component);
    }
}
