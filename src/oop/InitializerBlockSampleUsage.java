package oop;

public class InitializerBlockSampleUsage {

    public static void main(String as[]) {
        // Create a new oop.InitializerDemo1
        InitializerDemo1 initializerDemo1 = new InitializerDemo1(10);

        InitializerDemo1 initializerDemo12 = new InitializerDemo1();
        initializerDemo12.test = 3;
        System.out.println("Default Constructor invoked - test : " + initializerDemo12.test);

        System.out.println("Default Constructor invoked - test : " + initializerDemo1.test);

    }

    // Create a new oop.InitializerDemo3

}

class InitializerDemo1 {
    public int test;

    {
        System.out.println("Welcome to studytonight.com");
        System.out.println("This is Initializer block");

    }

    public InitializerDemo1() {
        System.out.println("Default Constructor invoked - test : " + test);

    }

    public InitializerDemo1(int test) {
        this.test = test;
        System.out.println("Default Constructor invoked - test : " + test);
    }


    public static void main(String as[]) {
        InitializerDemo1 obj = new InitializerDemo1();
        System.out.println("This is main() method");
    }
}

class InitializerDemo2 {
    static {
        System.out.println("inside parent initialisation block 2");
    }

    static {
        System.out.println("inside parent Static block 1");
    }

    public InitializerDemo2() {
        System.out.println("inside parent constructor");
    }

}

class InitializerDemo3 {
    static {
        System.out.println("inside satic block");
    }

    public InitializerDemo3() {
        System.out.println("inside constructor of child");
    }

    {
        System.out.println("inside initialization block");
    }

    public static void main(String[] args) {
        // new InitializerDemo2();
        // new InitializerDemo3();
        System.out.println("inside main");
    }
}