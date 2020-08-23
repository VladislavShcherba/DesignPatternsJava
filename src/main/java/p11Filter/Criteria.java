package p11Filter;

import java.util.LinkedList;
import java.util.List;

public interface Criteria {

    boolean isOk(A a);

    default List<A> filter(List<A> list) {
        List<A> newList = new LinkedList<>();
        for(A a : list) {
            if(isOk(a)) {
                newList.add(a);
            }
        }
        return newList;
    }

}
