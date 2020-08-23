package p11Filter;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Criteria xMoreThan3 = new XMoreThan(3);
        Criteria yLessThan5 = new YLessThan(5);
        Criteria or = new Or(xMoreThan3, yLessThan5);

        A a1 = new A(2,4);
        A a2 = new A(4,6);
        A a3 = new A(4,4);

        List<A> list = new LinkedList<A>(){{add(a1);add(a2);add(a3);}};
        System.out.println(xMoreThan3.filter(list));
        System.out.println(yLessThan5.filter(list));
        System.out.println(or.filter(list));
    }
}
