package p30BusinessDelegate;

public class ServiceB implements BusinessService {
    @Override
    public void doProcessing() {
        System.out.println("ServiceB doProcessing()");
    }
}