import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class epsilon_converter {
    static int valueof(String input) {
        int index = 0;
        int output = 0;
        int hundriedand=0;

        ArrayList<String> listtens = new ArrayList<>(Arrays.asList(
                "twenty", "thirty", "forty", "fifty",
                "sixty", "seventy", "eighty", "ninety"));
        ArrayList<Integer> tens = new ArrayList<>(Arrays.asList(20, 30, 40, 50, 60, 70, 80, 90));

        ArrayList<String> list = new ArrayList<>(Arrays.asList("zero", "one", "two"
                , "three", "four", "five", "six", "seven", "eight", "nine", "ten"
                , "eleven", "twelve", "thirteen", "fourteen", "fifteen"
                , "sixteen", "seventeen", "eighteen", "nineteen"));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7
                , 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19));




        if (input.contains("hundred")) {
            String part1 = input.substring(0, input.indexOf("hundred") + 7);
            input = input.substring(input.indexOf("hundred") + 7);
            for (int i = 0; i < list.size(); i++) {
                if (part1.contains(list.get(i))) {
                    hundriedand = hundriedand + list2.get(i) * 100;
                }
            }
        }


        for (int j = 0; j < listtens.size(); j++) {
            if (input.contains(listtens.get(j))) {
                String part3 = input.substring(input.indexOf(listtens.get(j)), input.indexOf(listtens.get(j)) + listtens.get(j).length());
                String part4 = input.substring(input.indexOf(listtens.get(j)) + listtens.get(j).length() - 1);
                input = part4;
                output = output + tens.get(j);
            }
        }


        for (int i = 0; i < list.size(); i++) {
            if (input.contains(list.get(i))) {    //this is for 0 to 19
                index = i;
            }
        }

        output = output + list2.get(index) + hundriedand;








        return  output;
    }
}
