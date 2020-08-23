package p27TemplateMethod;

public class ConcreteClass1 extends AbstractClass {
    @Override
    void step1() {
        System.out.println("ConcreteClass1::step1()");
    }

    @Override
    void step2() {
        System.out.println("ConcreteClass1::step2()");
    }

    @Override
    void step3() {
        System.out.println("ConcreteClass1::step3()");
    }
}
