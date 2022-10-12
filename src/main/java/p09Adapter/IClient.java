package p09Adapter;

// some client logic that needs input data in A format
// to be processed and output in C format
public interface IClient {
    C process(A a);
}
