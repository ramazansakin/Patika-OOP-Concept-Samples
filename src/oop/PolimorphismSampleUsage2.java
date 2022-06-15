package oop;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

interface Operator {

    default int calc(int a, int b) {
        return a + b;
    }
}

interface Operator2 {
    default int calc(int a, int b) {
        return 0;
    }
}

// Diamond Problem Solution
class Addition implements Operator, Operator2 {

    public int calc(int a, int b) {
        return Operator2.super.calc(a, b);
    }

}

class Subtraction implements Operator {
    public int calc(int a, int b) {
        return a - b;
    }
}

// Diamond Problem
//class AdditionAndSubtraction extends Addition, Subtraction {
//
//}

class Multiplication implements Operator {
    public int calc(int a, int b) {
        return a * b;
    }
}

class Division implements Operator {
    public int calc(int a, int b) {
        return a / b;
    }
}

public class PolimorphismSampleUsage2 {

    private static Map<String, Operator> calOp = new HashMap<>();

    {
        calOp.put("+", new Addition());
        calOp.put("-", new Subtraction());
        calOp.put("*", new Multiplication());
        calOp.put("/", new Division());
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("number #1 : ");
        int n1 = s.nextInt();

        System.out.print("operator  : ");
        String o = s.next();

        System.out.print("number #2 : ");
        int n2 = s.nextInt();

        Operator op = getOperator(o);
        System.out.println(op.calc(n1, n2));

    }

    // Strategy pattern with Factory
    public static Operator getOperator(String s) {
        return calOp.get(s);
    }
}
