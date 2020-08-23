package p08Prototype;

import java.util.HashMap;

public class CacheOfHasA {
    private HashMap<Integer, HasA> hash;
    public  CacheOfHasA() {
        hash = new HashMap<>();
        for(int i=0; i<100; i++) {
            hash.put(i, new HasA(new A(i)));
        }
    }
    public HasA get(int i) {
        HasA hasA = hash.get(i);
        if(hasA!=null) {
            try {
                return hasA.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
