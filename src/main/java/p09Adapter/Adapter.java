package p09Adapter;

public class Adapter {
    C bToC(B b) {
        //some logic B->C
        return new C();
    }
}
