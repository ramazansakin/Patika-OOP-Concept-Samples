package oop;

import java.util.Objects;

// sample Java program to illustrate the concept of inheritance
public class InheritanceSampleUsage {

    // "driver class" for test cases
    public static void main(String args[]) {
        MountainBike mountainBike = new MountainBike(3, 100, 25);
        System.out.println(mountainBike.toString());

        StreetBike streetBike = new StreetBike(3, 100, 25);
        System.out.println(streetBike.toString());
    }
}

// "base class/parent class/super class"
class Bicycle {
    // instance variables / attributes / fields
    protected int gear;
    public int speed;

    // default constructor
    public Bicycle() {
    }

    // constructor with all fields
    public Bicycle(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    // accessors / modifiers
    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // Class method definitions for "class behaviours"
    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment) {
        speed += increment;
    }

    // toString() method to print info of related oop.Bicycle
    @Override
    public String toString() {
        return ("No of gears are " + gear + "\n" + "speed of bicycle is " + speed);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bicycle)) return false;
        Bicycle bicycle = (Bicycle) o;
        return getGear() == bicycle.getGear() && getSpeed() == bicycle.getSpeed();
    }

    public static void main(String[] args) {
        // == operator
        Integer a = 5; // auto-boxing
        int b = new Integer(4); // auto-unboxing
        Integer c = new Integer(5);


        if (a == c) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }

        if (a.equals(c)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }

        Bicycle bicycle1 = new Bicycle(5, 10);
        Bicycle bicycle2 = new Bicycle(5, 10);

        System.out.println("Bicycle Test");
        if (bicycle1.equals(bicycle2)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }


    }

    @Override
    public int hashCode() {
        return Objects.hash(getGear(), getSpeed());
    }
}

// "derived class" from oop.Bicycle
class MountainBike extends Bicycle {

    // one more instance variable definition for mountain bike
    private int seatHeight;

    // "super" usage in constructor
    public MountainBike(int gear, int speed, int startHeight) {
        // invoking base-class(oop.Bicycle) constructor
        super(gear, speed);
        this.seatHeight = startHeight;
    }

    // setter for seatHeight field
    public void setHeight(int seatHeight) {
        this.seatHeight = seatHeight;
    }

    // getter for seatHeight field
    public int getSeatHeight() {
        return seatHeight;
    }

    // overriding toString() method to print more Bcycle info
    @Override
    public String toString() {
        return (super.toString() + "\nseat height is "
                + seatHeight);
    }
}

// another derived class from oop.Bicycle
class StreetBike extends Bicycle {

    // one more instance variable definition for mountain bike
    private int numberOfWheel;

    // "super" usage in constructor
    public StreetBike(int gear, int speed, int numberOfWheel) {
        // invoking base-class(oop.Bicycle) constructor
        super(gear, speed);
        this.numberOfWheel = numberOfWheel;
    }

    // Accessors & Modifiers
    public int getNumberOfWheel() {
        return numberOfWheel;
    }

    public void setNumberOfWheel(int numberOfWheel) {
        this.numberOfWheel = numberOfWheel;
    }

    // overriding the toString method
    @Override
    public String toString() {
        return (super.toString() + ", number of wheel is " + this.numberOfWheel);
    }

    // Overriding "equals" and "hashcode"
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StreetBike)) return false;
        StreetBike that = (StreetBike) o;
        return super.equals(o) && getNumberOfWheel() == that.getNumberOfWheel();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumberOfWheel());
    }
}