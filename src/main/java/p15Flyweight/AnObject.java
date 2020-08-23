package p15Flyweight;

public class AnObject {

    private static FlyweightFactory flyweightFactory = new FlyweightFactory();
    private double x,y;
    private Flyweight flyweight;

    public AnObject(double x, double y, int image3DId, int sound3DId) {
        this.x = x;
        this.y = y;
        this.flyweight = flyweightFactory.getFlyweight(image3DId, sound3DId);
    }

    public void handle() {
        System.out.println("Handling object on position x: " + x + ", y: " + y);
        flyweight.getImage().handle();
        flyweight.getSound().handle();
        System.out.println("-----------------------------------------------");
    }

}
