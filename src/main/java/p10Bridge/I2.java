package p10Bridge;

public class I2 implements Implementation {
    @Override
    public void i1() {
        System.out.println("I2::i1");
    }

    @Override
    public void i2() {
        System.out.println("I2::i2");
    }
}