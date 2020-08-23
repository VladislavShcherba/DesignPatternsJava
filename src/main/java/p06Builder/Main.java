package p06Builder;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        BuilderX builderX = new BuilderX();
        BuilderY builderY = new BuilderY();
        director.construct11(builderX);
        director.construct21(builderY);
        ObjectX objectX = builderX.getResult();
        ObjectY objectY = builderY.getResult();
    }
}
