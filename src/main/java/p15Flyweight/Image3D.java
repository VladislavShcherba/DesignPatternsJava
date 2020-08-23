package p15Flyweight;

public class Image3D {

    private int id;
    private double[] image3D;

    public Image3D(int id) {
        this.id = id;
        image3D = new double[128000]; // 1000KB
    }

    public void handle() {
        System.out.println("Image3D with id " + id + " is handled");
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
        Image3D anObj = (Image3D) obj;
        return id == anObj.id;
    }

}
