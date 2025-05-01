import java.util.ArrayList;
import java.util.Arrays;

public class huh_check {
    static boolean  huh(String realInput) {
        ArrayList<String> allWords = new ArrayList<>();
        allWords.addAll(Arrays.asList("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
                "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
                "eighteen", "nineteen", "twenty", "thirty", "forty", "fifty", "sixty", "seventy",
                "eighty", "ninety", "hundred", "hundred"));

        boolean isit=false;

        String cleanInput = realInput;

        for (int i = 0; i < cleanInput.length(); i++) {
            if (allWords.contains(cleanInput.charAt(i))) {isit=true;}
        }

        return isit;
    }
}
