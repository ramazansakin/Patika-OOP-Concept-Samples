package oop;

// Driver class for test cases
public class InterfaceSampleUsage {

    public static void main(String args[]) {
        // Sample usage for oop.Circle
        Drawable circle = new Circle(3.2); // In real scenario, object is provided by method e.g. getDrawable()
        circle.draw();

        // Sample usage for oop.Rectangle
        Drawable rectangle = new Rectangle(4, 5);
        rectangle.draw();
    }
}

// Interface declaration - Interface Segregation - Single Responsibility
interface Drawable {
    void draw();
}

interface Printable {
    void print();
}

// Implementation 1 - Liskov Substitution
class Rectangle implements Drawable, Printable {

    public int height;
    public int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle [Height: " + height + " - width: " + width + " ]");
    }

    @Override
    public void print() {
        System.out.println("[Height: " + height + " - width: " + width + " ]");
    }

}

// Open to Extension / Close to Modification
class SpecialRectangle extends Rectangle {

    private String special;

    public SpecialRectangle(int height, int width, String special) {
        super(height, width);
        this.special = special;
    }
}

// Implementation 2
class Circle implements Drawable {

    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing circle [Radius: " + radius + " ]");
    }

//    @Override
//    public void print() {
//        throw new UnsupportedOperationException();
//    }

}

// let's combine inheritance and interface
