package p15Flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private Map<Integer, Image3D> image3DMap;
    private Map<Integer, Sound3D> sound3DMap;

    public FlyweightFactory() {
        image3DMap = new HashMap<>();
        sound3DMap = new HashMap<>();
    }

    public Flyweight getFlyweight(int image3DId, int sound3DId) {
        return new Flyweight( getImage3D(image3DId), getSound3D(sound3DId) );
    }

    private Image3D getImage3D(int id) {
        if(image3DMap.containsKey(id)) {
            return image3DMap.get(id);
        }
        Image3D image3D = new Image3D(id);
        image3DMap.put(id, image3D);
        return image3D;
    }

    private Sound3D getSound3D(int id) {
        if(sound3DMap.containsKey(id)) {
            return sound3DMap.get(id);
        }
        Sound3D sound3D = new Sound3D(id);
        sound3DMap.put(id, sound3D);
        return sound3D;
    }
}
