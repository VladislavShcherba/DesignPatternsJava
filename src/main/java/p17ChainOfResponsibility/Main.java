package p17ChainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        Handler handler1 = new Handler1();
        Handler handler2 = new Handler2();
        Handler handler3 = new Handler3();
        handler1.setNext(handler2);
        handler2.setNext(handler3);
        System.out.println("----------------------------------");
        for(int i=0; i<10; i++) {
            Query query = new Query();
            System.out.println(handler1.handle(query));
            System.out.println("----------------------------------");
        }
    }
}
