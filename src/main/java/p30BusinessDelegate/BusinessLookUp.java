package p30BusinessDelegate;

public class BusinessLookUp {
    public BusinessService getBusinessService(String type) {
        if(type.equalsIgnoreCase("A")) {
            return new ServiceA();
        }
        return new ServiceB();
    }
}
