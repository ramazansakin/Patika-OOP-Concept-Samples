package oop;

import java.util.ArrayList;
import java.util.List;

// Sample Class Declaration
public class Dog implements Animal {
    // "Class fields" / "Instance Variables"
    // "Access modifiers"
    private String name;
    protected String breed;
    public String color;
    int age; // package-visibility
    // "Non-access modifiers" > static , final, abstract, transient, volatile, synchronized, native
    public static final boolean barking = true;

    // "Method signature"
    // "Constructor" Declaration
    // Full-parameter constructor

    // Sample "Method overriding"
    // Default No-parameter Constructor Declaration
    public Dog() {
    }

    // Constructor with name
    public Dog(String name) {
        this.name = name;
    }

    public Dog(String name, String breed, String color, int age) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.age = age;
    }

    // "Accessor&Modifier" methods / "Getter & Setters"
    // sample getter method declaration
    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    // sample setter method declaration
    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Sample "method overriding"
    @Override
    public String toString() {
        return ("Hi my name is " + this.getName() + ".\n" +
                "My breed,age and color are " +
                this.getBreed() + ", " + this.getAge() +
                ", " + this.getColor()) + "";
    }


    public static void main(String[] args) {
        // Sample oop.Dog "instantiation" with Default Constructor
        Dog sample = new Dog();
        System.out.println("Dog : " + sample.toString());

        // Add separator
        System.out.println("----------------------------------");
        // Sample oop.Dog "instantiation" with Fully-parameter Constructor
        Dog test = new Dog("Karabas", "Kangal", "siyah", 5);
        System.out.println(test);

        // Sample oop.Dog instantiation "statement" with default constructor

        System.out.println("----------------------------------");
        // Sample oop.Dog instantiation statement just with name
        Dog sample2 = new Dog("Ornek");
        System.out.println(sample2);
        System.out.println("----------------------------------");

        Integer testNumber = 1; // auto-boxing on wrapper class - Integer
        // input variable sent auto-boxed as Integer
        // returned variable as auto-boxed as Integer
        Integer a = getNumber(testNumber);
        System.out.println("Number : " + a);

        List numberList = new ArrayList<Integer>();
        numberList.add(1);
        numberList.add(6);
        numberList.add(15.7);
        // inappropriate usage
        // sum(numberList.toArray());

        int[] numberArray = new int[]{1 , 10, 15};
        numberArray[0] = 1;
        numberArray[1] = 10;
        numberArray[5] = 15;
        Integer sum = sum(numberArray);
        System.out.println("Result sum : " + sum);

    }

    // Method overloading
    public static int sum(int... numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; ++i) {
            sum += numbers[i];
            System.out.println(i);
        }
        return sum;
    }

    public static int getNumber(int number) {
        return number;
    }


    @Override
    public void sound() {
        System.out.println("Woow woooow");
    }
}