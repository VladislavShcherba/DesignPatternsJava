package p17ChainOfResponsibility;

public class Query {

    private int type;

    public Query() {
        type = (int)(4 * Math.random())+1;
    }

    public int getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Query{type=" + type + "}";
    }

}
