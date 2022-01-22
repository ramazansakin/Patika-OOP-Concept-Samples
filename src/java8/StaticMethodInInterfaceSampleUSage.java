//package java8;
//
//public class StaticMethodInInterfaceSampleUSage {
//
//    public static void main(String[] args) {
//        MyDataImpl obj = new MyDataImpl();
//        obj.print("");
//        obj.isNull("abc");
//    }
//
//}
//
//interface MyData {
//
//    default void print(String str) {
//        if (!isNull(str))
//            System.out.println("MyData Print::" + str);
//    }
//
//    static boolean isNull(String str) {
//        System.out.println("Interface Null Check");
//
//        return str == null ? true : "".equals(str) ? true : false;
//    }
//}
//
//class MyDataImpl implements MyData {
//
//
//}