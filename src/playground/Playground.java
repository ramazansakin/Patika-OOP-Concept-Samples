package playground;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Playground {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

        List<List<Integer>> myNumbersList = new ArrayList<>();
        myNumbersList.add(Arrays.asList(1, 2, 3));


    }

}

class MyRegex {
    public String pattern = "^([01]?[0-9][0-9]?|2[0-4][0-9]|25[0-5])\\." +
            "([01]?[0-9][0-9]?|2[0-4][0-9]|25[0-5])\\." +
            "([01]?[0-9][0-9]?|2[0-4][0-9]|25[0-5])\\." +
            "([01]?[0-9][0-9]?|2[0-4][0-9]|25[0-5])$";
}
