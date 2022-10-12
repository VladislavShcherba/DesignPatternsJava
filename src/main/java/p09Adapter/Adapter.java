package p09Adapter;

public class Adapter implements IClient {

    private final Library library = new Library();

    private B convert(A a) {
        //some code to convert A format to B format
        return new B();
    }

    @Override
    public C process(A a) {
        B b = convert(a);
        return library.process(b);
    }
}
