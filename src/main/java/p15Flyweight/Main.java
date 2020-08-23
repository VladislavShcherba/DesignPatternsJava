package p15Flyweight;

public class Main {
    public static void main(String[] args) {
        int n = 1000000;
        AnObject[] objects = new AnObject[n];
        for(int i=0; i<n; i++) {
            int imageId = (int) (Math.random() * 10);
            int soundId = (int) (Math.random() * 10);
            double x = Math.random() * 1e6;
            double y = Math.random() * 1e6;
            objects[i] = new AnObject(x, y, imageId, soundId);
        }

        for(int i=0; i<n; i++) {
            objects[i].handle();
        }
    }
}
