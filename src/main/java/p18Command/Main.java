package p18Command;

public class Main {
    public static void main(String[] args) {
        BusinessLogic businessLogic = new BusinessLogic("Main Logic");
        PresentationLayer presentationLayer = new PresentationLayer(businessLogic);
        presentationLayer.clickA();
        presentationLayer.pressCtrlA();
        presentationLayer.clickB();
        presentationLayer.pressCtrlB();
    }
}
