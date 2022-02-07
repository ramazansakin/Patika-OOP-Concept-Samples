package playground;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtractorTest {

    private static String tagReg = "<(.+)>([^<]+)</\\1>";
    private static Pattern tagPattern = Pattern.compile(tagReg);

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        while (testCases > 0) {
            String line = in.nextLine();

            extractContent(line);
            testCases--;
        }
    }

    private static void extractContent(String line) {
        Matcher tagMatcher = tagPattern.matcher(line);
        if (tagMatcher.find()) {
            do {
                System.out.println(tagMatcher.group(2));
            } while (tagMatcher.find());
        } else {
            System.out.println("None");
        }
    }
}
