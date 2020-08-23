package p18Command;

public class CommandA implements Command {

    private BusinessLogic businessLogic;
    private String param;

    public CommandA(BusinessLogic businessLogic, String param) {
        this.businessLogic = businessLogic;
        this.param = param;
    }

    @Override
    public void execute() {
        businessLogic.doA(param);
    }
}
