package java8;

public class FunctionalInterfaceSampleUsage2 {

    public void say(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        FunctionalInterfaceSampleUsage2 fie = new FunctionalInterfaceSampleUsage2();
        fie.say("Hello there");
    }
}

// "SAM" Interface
@FunctionalInterface
interface Sayable {
    void say(String msg);

    // It can contain any number of "Object class methods"

}


// 2 --------------------------
// Not valid usage
interface Sayable2 {
    void tell(String msg);   // abstract method
}

//@FunctionalInterface
//interface Doable extends Sayable2 {
//    void doIt();
//}



// "This is not a clean code advice"
// 3 ------------------------------
interface Doable2 {
    default void doIt() {
        System.out.println("Do it now");
    }
}

@FunctionalInterface
interface Sayable3 extends Doable2 {
    void say(String msg);   // abstract method
}

class FunctionalInterfaceExample3 implements Sayable3 {

    public void say(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        FunctionalInterfaceExample3 fie = new FunctionalInterfaceExample3();
        fie.say("Hello there");
        fie.doIt();
    }
}