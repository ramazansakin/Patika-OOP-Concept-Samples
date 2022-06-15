package oop;

class Calculation {
    int z;

    public void addition(int x, int y) {
        z = x + y;
        System.out.println("The sum of the given numbers:" + z);
    }

    public void Subtraction(int x, int y) {
        z = x - y;
        System.out.println("The difference between the given numbers:" + z);
    }
}

class Calculation_Extention extends Calculation {

    public void multiplication(int x, int y) {
        z = x * y;
        System.out.println("The product of the given numbers:" + z);
    }

}

public class InheritanceSampleUsage3 {

    public static void main(String args[]) {
        int a = 20, b = 10;
        Calculation_Extention demo = new Calculation_Extention();
        demo.addition(a, b);
        demo.Subtraction(a, b);
        demo.multiplication(a, b);
    }
}

/*
    Super/Sub Sample Usage
*/
class Super_class {

    int num = 20;

    public Super_class(int num) {
        this.num = num;
    }

    // display method of superclass
    public void display() {
        System.out.println("This is the display method of superclass");
    }

}

class Sub_class extends Super_class {
    int num = 10;

    // display method of sub class
    public void display() {
        System.out.println("This is the display method of subclass");
    }

    Sub_class(int age) {
        super(age);
    }

    public void my_method() {
        // Instantiating subclass
        Sub_class sub = new Sub_class(10);

        // Invoking the display() method of sub class
        sub.display();

        // Invoking the display() method of superclass
        super.display();

        // printing the value of variable num of subclass
        System.out.println("value of the variable named num in sub class:" + sub.num);

        // printing the value of variable num of superclass
        System.out.println("value of the variable named num in super class:" + super.num);
    }

    public static void main(String args[]) {
        Sub_class obj = new Sub_class(5);
        obj.my_method();
    }

}

/*
    IS-A Sample Usage
*/

class Animall {
}

class Mammal extends Animall {
}

class Reptile extends Animall {
}

class Dogg extends Mammal {

    public static void main(String args[]) {
        Animall a = new Animall();
        Mammal m = new Mammal();
        Dogg d = new Dogg();

        System.out.println(m instanceof Animall);
        System.out.println(d instanceof Mammal);
        System.out.println(d instanceof Animal);
    }
}



/*
    OVERRIDE Sample Usage
*/
class Animal2 {
    public void move() {
        System.out.println("Animals can move");
    }
}

class Dog2 extends Animal2 {
    public void move() {
        System.out.println("Dogs can walk and run");
    }
//    public void bark() {
//        System.out.println("Dogs can bark");
//    }
}

class TestDog {

    public static void main(String args[]) {
        Animal2 a = new Animal2();   // Animal reference and object
        Animal2 b = new Dog2();   // Animal reference but Dog object

        a.move();   // runs the method in Animal class
        b.move();   // runs the method in Dog class
    }
}