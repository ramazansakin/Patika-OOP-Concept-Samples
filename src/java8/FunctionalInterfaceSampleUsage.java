package java8;

public class FunctionalInterfaceSampleUsage {

    public static void main(String[] args) {
        // lambda expression
        MyFunctionalInterface msg = () -> {
            return "Hello";
        };
        System.out.println(msg.sayHello());


        // lambda expression with single parameter num
        MyFunctionalInterface2 f = (num) -> num + 5;
        System.out.println(f.incrementByFive(22));

        // lambda expression with multiple arguments
        StringConcat s = (str1, str2) -> str1 + str2;
        System.out.println("Result: " + s.sconcat("Hello ", "World"));
    }
}

@FunctionalInterface
interface MyFunctionalInterface {
    // method with no parameter
    String sayHello();
}

@FunctionalInterface
interface MyFunctionalInterface2 {

    // method with single parameter
    public int incrementByFive(int a);
}

interface StringConcat {

    public String sconcat(String a, String b);
}