package p18Command;

public class PresentationLayer {

    private BusinessLogic businessLogic;

    public PresentationLayer(BusinessLogic businessLogic) {
        this.businessLogic = businessLogic;
    }

    public void clickA() {
        new CommandA(businessLogic, "param1").execute();
    }

    public void pressCtrlA() {
        new CommandA(businessLogic, "param1").execute();
    }

    public void clickB() {
        new CommandB(businessLogic, "param2").execute();
    }

    public void pressCtrlB() {
        new CommandB(businessLogic, "param2").execute();
    }

}
