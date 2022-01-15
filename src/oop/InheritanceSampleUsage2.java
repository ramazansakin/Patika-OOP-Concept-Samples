package oop;

// driver class
public class InheritanceSampleUsage2 {
}

abstract class Teacher {
    String mainSubject;
    String designation;
    String collegeName;

    public Teacher(String mainSubject, String designation, String collegeName) {
        this.mainSubject = mainSubject;
        this.designation = designation;
        this.collegeName = collegeName;
    }

    public void teach() {
        System.out.println("Teaching " + mainSubject);
    }
}


class PhysicsTeacher extends Teacher {
    public PhysicsTeacher(String designation, String collegeName){
        super("Physics", designation, collegeName );
    }
}

class MathTeacher extends Teacher {
    private final static String mainSubject = "Math";
    public MathTeacher(String designation, String collegeName) {
        super(mainSubject, designation, collegeName);
    }
}