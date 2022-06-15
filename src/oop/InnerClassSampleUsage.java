package oop;

// driver class
public class InnerClassSampleUsage {

    public static void main(String[] args) {
        // Inner class sample usage
        OuterClass myOuter = new OuterClass();

        // Static inner class instantiation
//        OuterClass.InnerClass myInner = new OuterClass.InnerClass();
        myOuter.setInnerClass(10);

        System.out.println("Sum of Outer class X + inner class Y : ");
        System.out.println( myOuter.x + myOuter.getInnerClassY() );
    }

}

class OuterClass {
    public int x = 10;
    private InnerClass innerClass;

    // make it private and test ?
    private class InnerClass {
        public int y = 5;

        public int getY() {
            return y;
        }
    }

    public void setInnerClass(int y) {
        this.innerClass = new InnerClass();
        this.innerClass.y = y;
    }

    public InnerClass getInnerClass() {
        return innerClass;
    }

    public int getInnerClassY(){
        return innerClass.getY();
    }

}