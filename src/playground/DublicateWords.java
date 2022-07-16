package playground;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DublicateWords {

    public static void main(String[] args) {


    }

    List<String> solution(List<String> strings) {

        Collections.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String string1, String string2) {
                int string1L = digitsInString(string1);
                int string2L = digitsInString(string2);
                return string1L - string2L;
            }

            private int digitsInString(String string) {
                return string.split(" ").length;
            }
        });

        return strings;
    }

}
