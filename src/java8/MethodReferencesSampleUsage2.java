package java8;

import java.util.function.BiFunction;

// 2) Reference to an Instance Method
public class MethodReferencesSampleUsage2 {

    @FunctionalInterface
    interface Sayable {
        void say();
    }

    public void print(){
        System.out.println("Printing...");
    }

    public static void saySomething() {
        System.out.println("Hello, this is non-static method.");
    }

    public static void main(String[] args) {
        MethodReferencesSampleUsage2 methodReference = new MethodReferencesSampleUsage2(); // Creating object
        // Referring non-static method using reference
        // instance method reference
        Sayable sayable = methodReference::print;
        // Calling interface method
        sayable.say();
        // Referring non-static method using anonymous object
        // static method reference
        Sayable sayable2 = MethodReferencesSampleUsage2::saySomething; // You can use anonymous object also
        // Calling interface method
        sayable2.say();
    }

}


// 2 --------------------------------------------
class InstanceMethodReference3 {

    public static void main(String[] args) {
        BiFunction<Double, Integer, Double> adder = new Arithmetic()::add;
        double result = adder.apply(10.0, 20);
        System.out.println(result);
    }

    static class Arithmetic {
        public double add(double a, int b) {
            return a + b;
        }
    }
}