package p30BusinessDelegate;

public class ServiceA implements BusinessService {
    @Override
    public void doProcessing() {
        System.out.println("ServiceA doProcessing()");
    }
}
