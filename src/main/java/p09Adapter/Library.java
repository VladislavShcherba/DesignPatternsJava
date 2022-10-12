package p09Adapter;

//some 3rd party library that can process data in B format
// and return processed data in C format
public class Library {

    public C process(B b) {
        //some code to process B and receive C
        return new C();
    }
}
