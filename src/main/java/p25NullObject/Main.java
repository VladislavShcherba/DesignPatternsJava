package p25NullObject;

public class Main {

    static AbstractCustomer requestCustomer() {
        if(Math.random() > 0.5) {
            return new Customer("Max Power");
        }
        return new NullCustomer();
    }

    public static void main(String[] args) {
        for(int i=0; i<5; i++) {
            System.out.println(requestCustomer().getName());
        }
    }
}
