package java8;

import com.sun.xml.internal.ws.util.StringUtils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ForEachSampleUsage {

    // "for-each" | "enhanced for"
    public static void main(String[] args) {

        // 1 ---------------------------------------------
        // creating sample Collection
        List<Integer> myList = new ArrayList<Integer>();
        myList.add(1);
        myList.add(10);
        myList.add(new Integer(15));
        Integer sampleNumber = 21;
        myList.add(sampleNumber);

        // i++  vs  ++i
        for (int i = 0; i < 10; ++i) {
            myList.add(i);
        }

        // traverse myList via enhanced for-each
        for (Integer num : myList) {
            System.out.println("List num : " + num);
        }


        // Try with normal reference array
        Integer[] numbers = new Integer[5];
        numbers[0] = 15;
        numbers[1] = 5;
        for (Integer number : numbers) {
            System.out.println(number);
        }

        // Primitive int default value -vs- Reference Integer default value ?
        // Try with primitive type array
        int[] numberPrimitive = new int[5];
        numberPrimitive[3] = 12;
        for (int number : numberPrimitive) {
            System.out.println(number);
        }


        // how to traverse - alternative
        // traversing using Iterator
        Iterator<Integer> it = myList.iterator();
        while (it.hasNext()) {
            Integer i = it.next();
            System.out.println("Iterator Value::" + i);
        }

        // traversing through forEach method of Iterable with anonymous class
        myList.forEach(new Consumer<Integer>() {
            public void accept(Integer t) {
                System.out.println("forEach anonymous class Value::" + t);
            }
        });

        // traversing with customized/user-defined Consumer interface implementation
        Print printAction = new Print();
        myList.forEach(printAction);


//        // 2 ---------------------------------------------
        List<String> gamesList = new ArrayList<String>();
        gamesList.add("Chess");
        gamesList.add("Football");
        gamesList.add("Wrestling");
        gamesList.add("Cricket");
        gamesList.add("Hockey");
        System.out.println("------------Iterating by passing method reference---------------");
        // String
        gamesList.forEach(System.out::println);


    }
}

// Consumer implementation that can be reused
class Print implements Consumer<Integer> {

    @Override
    public void accept(Integer t) {
        System.out.println("Integer value ::" + t);
    }
}