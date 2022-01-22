package java8;


class Addition {
    static int add(int a, int b) {
        return a + b;
    }
}

public class LambdaExpressionSampleUsage {

    public static void main(String[] args) {

        // anonymous method declaration
        // with type declaration
        MathOperation addition = Addition::add;

        // without type declaration
        MathOperation subtraction = (a, b) -> {
            return a - b;
        };

        // with return statement along with curly braces
        MathOperation multiplication = (int a, int b) -> {
            int c = a * b;
            return c;
        };

        // without return statement and without curly braces
        MathOperation division = (int a, int b) -> a / b;

        // "Why we need to declare a test object, optimize here"
        // Object creation is expensive!
        LambdaExpressionSampleUsage tester = new LambdaExpressionSampleUsage();

        System.out.println("20 + 5 = " + tester.operate(20, 5, addition));
        System.out.println("15 - 4 = " + tester.operate(15, 4, subtraction));
        System.out.println("12 x 8 = " + tester.operate(12, 8, multiplication));
        System.out.println("20 / 4 = " + tester.operate(20, 4, division));

        // parameter without parenthesis
        GreetingService greetService1 = message ->
                System.out.println("Hello " + message);

        // parameter with parenthesis
        GreetingService greetService2 = (message) ->
                System.out.println("Hello " + message);

        greetService1.sayMessage("Mahesh");
        greetService2.sayMessage("Suresh");
    }

    @FunctionalInterface
    interface MathOperation {
        int operation(int a, int b);
    }

    @FunctionalInterface
    interface GreetingService {
        void sayMessage(String message);
    }

    private int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }
}
