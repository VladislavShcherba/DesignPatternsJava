package p18Command;

public class CommandB implements Command {

    private BusinessLogic businessLogic;
    private String param;

    public CommandB(BusinessLogic businessLogic, String param) {
        this.businessLogic = businessLogic;
        this.param = param;
    }

    @Override
    public void execute() {
        businessLogic.doB(param);
    }
}