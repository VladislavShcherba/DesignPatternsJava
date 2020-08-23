package p15Flyweight;

public class Flyweight {
    private Image3D image;
    private Sound3D sound;

    public Flyweight(Image3D image, Sound3D sound) {
        this.image = image;
        this.sound = sound;
    }

    public Image3D getImage() {
        return image;
    }

    public Sound3D getSound() {
        return sound;
    }
}
