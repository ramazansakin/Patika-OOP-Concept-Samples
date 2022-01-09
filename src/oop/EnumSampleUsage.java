package oop;

// driver class
public class EnumSampleUsage {


}


class EnumUsage1 {
    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }

    public static void main(String[] args) {
        Level myVar = Level.MEDIUM;
        System.out.println(myVar);
    }
}

enum Level {
    LOW,
    MEDIUM,
    HIGH
}

class EnumUsage2 {
    public static void main(String[] args) {
        Level myVar = Level.MEDIUM;

        switch (myVar) {
            case LOW:
                System.out.println("Low level");
                break;
            case MEDIUM:
                System.out.println("Medium level");
                break;
            case HIGH:
                System.out.println("High level");
                break;
        }
    }
}

class EnumUsage3 {
    public static void main(String[] args) {
        for (Level myVar : Level.values()) {
            System.out.println(myVar);
        }
    }
}