package p18Command;

public class BusinessLogic {
    private String businessLogicName;

    public BusinessLogic(String businessLogicName) {
        this.businessLogicName = businessLogicName;
    }

    public void doA(String param) {
        System.out.println("BusinessLogic(" + businessLogicName + ")::doA(" + param + ")");
    }

    public void doB(String param) {
        System.out.println("BusinessLogic(" + businessLogicName + ")::doB(" + param + ")");
    }
}
