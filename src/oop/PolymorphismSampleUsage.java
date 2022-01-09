package oop;

import java.util.ArrayList;
import java.util.List;

// Driver class for test cases
public class PolymorphismSampleUsage {

    public static void main(String[] args) {
        // Sample basic usages
        System.out.println("Start of Test Case 1 ------------------------------------");
        Animal myCat = new Cat();  // Create a oop.Cat object
        myCat.sound();

        Animal myFrog = new Frog();  // Create a oop.Frog object
        myFrog.sound();
        System.out.println("End of Test Case 1 ------------------------------------\n");

        // Sample usage
        System.out.println("Start of Test Case 2 ------------------------------------");
        List<Animal> animals = new ArrayList<>();
        animals.add(myCat);
        animals.add(myFrog);

        // Trying to add oop.Dog object
        Dog sampleDog = new oop.Dog("Karabaş", "Kangal", "Kahverengi", 5);
        animals.add(sampleDog);

        // ... some
        // business logic ...
        // strategy design pattern
        for(Animal animal : animals){
            if(animal instanceof Cat){
                System.out.println("This is a cat");
                animal.sound();
            } else if(animal instanceof Frog){
                System.out.println("This is a frog");
                animal.sound();
            }
        }
        System.out.println("End of Test Case 2 ------------------------------------\n");


        // We can just use below clean code to do the same thing above as:
        System.out.println("Start of Test Case 3 ------------------------------------");
        for(Animal animal : animals){
            animal.sound();
        }
        System.out.println("End of Test Case 3 ------------------------------------");

    }
}

interface Animal {
    void sound();
}

// find a different instance field and create an abstract class for them
class Cat implements Animal {
    private String name;
    private String color;
    private int age;
    public void sound() {
        System.out.println("Meoww meoowww");
    }
}

class Frog implements Animal {
    private String name;
    private String color;
    // inspect Integer Class
    private Integer age;
    public void sound() {
        System.out.println("Croac croac");
    }
}