package p15Flyweight;

public class Sound3D {

    private int id;
    private double[] sound3D;

    public Sound3D(int id) {
        this.id = id;
        sound3D = new double[128000]; // 1000KB
    }

    public void handle() {
        System.out.println("Sound3D with id " + id + " is handled");
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) {
            return false;
        }
        if(obj == this) {
            return true;
        }
        if(getClass() != obj.getClass()) {
            return false;
        }
        Sound3D anObj = (Sound3D) obj;
        return id == anObj.id;
    }

}
