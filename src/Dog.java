// Sample Class Declaration
public class Dog {
    // "Class fields" / "Instance Variables"
    // "Access modifiers"
    private String name;
    protected String breed;
    public String color;
    int age;
    // "Non-access modifiers" > static , final, abstract, transient, volatile, synchronized, native
    public static final boolean barking = true;

    // "Method signature"
    // "Constructor" Declaration
    public Dog(String name, String breed, int age, String color) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }

    // Sample "Method overriding"
    // Default No-parameter Constructor Declaration
    public Dog() {
    }

    // Constructor with name


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

    // Sample "method overloading"
    @Override
    public String toString() {
        return ("Hi my name is " + this.getName() + ".\n" +
                "My breed,age and color are " +
                this.getBreed() + ", " + this.getAge() +
                ", " + this.getColor()) + "";
    }

    public static void main(String[] args) {
        // Sample Dog "instantiation"
        Dog sampleDog = new Dog("Karabaş", "Kangal", 5, "Kahverengi");
        System.out.println(sampleDog.toString());
        // System.out.println("----------------------------------");

        // Sample Dog instantiation "statement" with default constructor


        // Sample Dog instantiation statement just with name


    }

}