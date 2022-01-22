package java8;

public class StaticAndDefaultMethodsInInterfaceSampleUsage {
}

interface Interface1 {

    void method1(String str);

    default void log(String str) {
        System.out.println("I1 logging::" + str);
    }

    static void print(String str) {
        System.out.println("Printing " + str);
    }

}

interface Interface2 {

    void method2();

    default void log(String str) {
        System.out.println("I2 logging::" + str);
    }

}

class MyClass implements Interface1, Interface2 {

    @Override
    public void method2() {
    }

    @Override
    public void method1(String str) {
    }

    // MyClass won't compile without having it's own log() implementation
    @Override
    public void log(String str) {
        System.out.println("MyClass logging::" + str);
    }

}