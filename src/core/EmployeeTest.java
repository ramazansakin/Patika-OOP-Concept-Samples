package core;

import com.sun.media.sound.InvalidDataException;
import com.sun.media.sound.InvalidFormatException;
import oop.MyCustomException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmployeeTest {


    public static void main(String args[]) {

        FileInputStream fileInputStream = null;
        try {
            fileInputStream = sampleExceptionThrowMethod(false, true);
            // Business Logic
        } catch (MyCustomException e) {
            System.err.println(e.getMessage());
        } catch (InvalidFormatException e) {
            System.err.println("Valid format is : bla bla" + "but yours' :" + e.getMessage());
        } catch (FileNotFoundException | InvalidDataException e) {
            System.err.println(e.getMessage());
        } finally {
            try {
                if (fileInputStream.available() == 1) {
                    fileInputStream.close();
                }
            } catch (IOException e) {
                System.err.println(e.getMessage());
            } catch (NullPointerException e){
                System.err.println("The file is not found");
            }
        }

        // Sample System.in usage
//        Scanner scanner = new Scanner(System.in); // Console
//
//        System.out.println("Lütfen bir sayı giriniz : ");
//        int integer = scanner.nextInt();
//        System.out.println("Input integer : " + integer);

//        System.err.println("Sample Error message");

//        for (String arg : args) {
//            System.out.println("Arg : " + arg);
//        }

//        test3dotOperator("test", "test2", "test3");


//        Employee employee1 = new Employee();
//
//        employee1.setName("Ahmet");
//
////        employee1.printEmployee();
//
//        System.out.println(employee1);

//        Employee employee2 = new Employee();
//
//        System.out.println(employee2.getName());

//
//        System.out.println();
//
//        Employee.getName();

//        System.out.println("--------------------------------------------------");
//
//        /* Create two objects using constructor */
//        Employee empOne = new Employee();
//        Employee empTwo = new Employee("Mary Anne");
//
//        // Invoking methods for each object created
//        empOne.setName("James Smith");
//        empOne.empAge(26);
//        empOne.empDesignation("Senior Software Engineer");
//        empOne.empSalary(1000);
//        empOne.printEmployee();
//
//        empTwo.empAge(21);
//        empTwo.empDesignation("Software Engineer");
//        empTwo.empSalary(500);
//        empTwo.printEmployee();


//        Sample Usage for Operators
//        int a, b;
//        a = 10;
//        b = (a == 1) ? 20: 30;
//        System.out.println( "Value of b is : " +  b );
//
//        b = (a == 10) ? 20: 30;
//        System.out.println( "Value of b is : " + b );


//        Sample Usages for Loop
//        int [] numbers = {10, 20, 30, 40, 50};
//
//        for(int x : numbers ) {
//            System.out.print( x );
//            System.out.print(",");
//        }
//        System.out.print("\n");
//        String [] names = {"James", "Larry", "Tom", "Lacy"};
//
//        for( String name : names ) {
//            System.out.print( name );
//            System.out.print(",");
//        }


//        Sample Array Usages
//        double[] myList = {1.9, 2.9, 3.4, 3.5};
//
//        // Print all the array elements
//        for (int i = 0; i < myList.length; i++) {
//            System.out.println(myList[i] + " ");
//        }
//
//        // Summing all elements
//        double total = 0;
//        for (int i = 0; i < myList.length; i++) {
//            total += myList[i];
//        }
//        System.out.println("Total is " + total);
//
//        // Finding the largest element
//        double max = myList[0];
//        for (int i = 1; i < myList.length; i++) {
//            if (myList[i] > max) max = myList[i];
//        }
//        System.out.println("Max is " + max);


        // Date & Time Sample Usage
        String months[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep",
                "Oct", "Nov", "Dec"};

        int year;
        // Create a Gregorian calendar initialized
        // with the current date and time in the
        // default locale and timezone.

//        GregorianCalendar gcalendar = new GregorianCalendar();
//
//        // Display current time and date information.
//        System.out.print("Date: ");
//        System.out.print(months[gcalendar.get(Calendar.MONTH)]);
//        System.out.print(" " + gcalendar.get(Calendar.DATE) + " ");
//        System.out.println(year = gcalendar.get(Calendar.YEAR));
//        System.out.print("Time: ");
//        System.out.print(gcalendar.get(Calendar.HOUR) + ":");
//        System.out.print(gcalendar.get(Calendar.MINUTE) + ":");
//        System.out.println(gcalendar.get(Calendar.SECOND));
//
//        // Test if the current year is a leap year
//        if(gcalendar.isLeapYear(year)) {
//            System.out.println("The current year is a leap year");
//        }else {
//            System.out.println("The current year is not a leap year");
//        }


        // Sample Regular Expressions - 1
//        final String REGEX = "\\bcat\\b";
//        final String INPUT = "cat cat cat cattie cat";
//
//        Pattern p = Pattern.compile(REGEX);
//        Matcher m = p.matcher(INPUT);   // get a matcher object
//        int count = 0;
//
//        while (m.find()) {
//            count++;
//            System.out.println("Match number " + count);
//            System.out.println("start(): " + m.start());
//            System.out.println("end(): " + m.end());
//        }


//      Sample Regular Expressions - 2
//        final String REGEX = "foo";
//        final String INPUT = "fooooooooooooooooo";
//        Pattern pattern;
//        Matcher matcher;
//
//        pattern = Pattern.compile(REGEX);
//        matcher = pattern.matcher(INPUT);
//
//        System.out.println("Current REGEX is: " + REGEX);
//        System.out.println("Current INPUT is: " + INPUT);
//
//        System.out.println("lookingAt(): " + matcher.lookingAt());
//        System.out.println("matches(): " + matcher.matches());
//


    }

    private static FileInputStream sampleExceptionThrowMethod(boolean test, boolean test2)
            throws FileNotFoundException, InvalidDataException {
        // Open sample file operation
//        try {
        FileInputStream fileInputStream = new FileInputStream("test.txt");
        // Some Business Logic
        if (test) {
            throw new InvalidDataException("Invalid Data");
        } else {
            if (test2) {
                throw new MyCustomException("My custom Exception Cause Message");
            } else {
                throw new InvalidFormatException("Invalid Format");
            }
        }


//        } catch (FileNotFoundException e) {
//            System.err.println(e.getMessage());
//        }

    }

    private static void test3dotOperator(String... tests) {

        for (int i = 0; i < tests.length; i++) {
            System.out.println("Var-args " + (i + 1) + ". index : " + tests[i]);
        }

    }


    // Method overloading
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

}
