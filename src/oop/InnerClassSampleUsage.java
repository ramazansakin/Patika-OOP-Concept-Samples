package oop;

// driver class
public class InnerClassSampleUsage {

    public static void main(String[] args) {
        // Inner class sample usage
        OuterClass myOuter = new OuterClass();

        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.y + myOuter.x);
    }

}

class OuterClass {
    int x = 10;

    // make it private and test ?
    class InnerClass {
        int y = 5;
    }
}