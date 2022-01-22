package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaExpressionSampleUsage2 {

    public static void main(String[] args) {

        // declare a reference to MyInterface
        // assign a lambda expression to the reference
        MyInterface ref = (str) -> {
            String result = "";
            for (int i = str.length() - 1; i >= 0; --i)
                result += str.charAt(i);
            return result;
        };

        // call the method of the interface
        System.out.println("Lambda reversed = " + ref.reverse("Lambda"));

        // declare a reference to GenericInterface
        // the GenericInterface operates on String data
        // assign a lambda expression to it
        GenericInterface<String> reverse = (str) -> {

            String result = "";
            for (int i = str.length() - 1; i >= 0; i--)
                result += str.charAt(i);
            return result;
        };

        System.out.println("Lambda reversed = " + reverse.func("Lambda"));

        // declare another reference to GenericInterface
        // the GenericInterface operates on Integer data
        // assign a lambda expression to it
        GenericInterface<Integer> factorial = (n) -> {

            int result = 1;
            for (int i = 1; i <= n; i++)
                result = i * result;
            return result;
        };
//
        System.out.println("factorial of 5 = " + factorial.func(5));
    }
}

@FunctionalInterface
interface MyInterface {

    // abstract method
    String reverse(String n);
}

// GenericInterface.java
@FunctionalInterface
interface GenericInterface<T> {

    // generic method
    T func(T t);
}


// 2 -----------------------------------
// Java Lambda Expression Example: Foreach Loop
class LambdaExpressionExample7 {
    public static void main(String[] args) {

        // "Naming convention List"
        List<String> cityList = new ArrayList<String>();
        cityList.add("İstanbul");
        cityList.add("Kocaeli");
        cityList.add("Sakarya");
        cityList.add("Afyon");
        cityList.add("Malatya");

        // "Method Reference"
        cityList.forEach(
                (n) -> System.out.println(n)
        );
    }
}


// 3 ------------------------------------------
// Java Lambda Expression Example: Creating Thread
class LambdaExpressionExample9 {

    public static void main(String[] args) {

        //Thread Example without lambda
        Runnable r1 = new Runnable() {
            public void run() {
                System.out.println("Thread1 is running...");
            }
        };
        Thread t1 = new Thread(r1);
        t1.start();
        //Thread Example with lambda
        Runnable r2 = () -> {
            System.out.println("Thread2 is running...");
        };
        Thread t2 = new Thread(r2);
        t2.start();
    }
}


// 4 --------------------------------------------------
// Java Lambda Expression Example: Comparator
class Product {
    int id;
    String name;
    float price;

    public Product(int id, String name, float price) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

class LambdaExpressionExample10 {

    public static void main(String[] args) {
        List<Product> list = new ArrayList<Product>();

        //Adding Products
        list.add(new Product(1, "HP Laptop", 25000f));
        list.add(new Product(3, "Keyboard", 300f));
        list.add(new Product(2, "Dell Mouse", 150f));

        System.out.println("Sorting on the basis of name...");

        // implementing lambda expression
        Collections.sort(list, (p1, p2) -> {
            return p1.name.compareTo(p2.name);
        });
        for (Product p : list) {
            System.out.println(p.id + " " + p.name + " " + p.price);
        }

    }
}