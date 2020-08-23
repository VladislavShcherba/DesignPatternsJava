package p03AbstractFactory;

public class FactoryProducer {
    public AAbstractFactory getAFactory(String which) {
        switch (which) {
            case "A" : return new AAFactory();
            case "B" : return new ABFactory();
            default: return null;
        }
    }
}
