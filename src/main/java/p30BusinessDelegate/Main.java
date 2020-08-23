package p30BusinessDelegate;

public class Main {
    public static void main(String[] args) {
        BusinessDelegate business = new BusinessDelegate();
        Client client = new Client(business);
        business.setServiceType("A");
        client.doTask();
    }
}
