package p08Prototype;

public class Main {
    public static void main(String[] args) {
        CacheOfHasA cache = new CacheOfHasA();
        HasA a = cache.get(1);
        a.getA().setX(2);
        a = cache.get(1);
        System.out.println(a.getA().getX());
    }
}
