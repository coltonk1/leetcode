import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

//Convert a non-negative integer num to its English words representation.

//Hard

class Solution273 {
    public static void main(String[] args) {
        Integer num = 1000000000;
        System.out.println(numberToWords(num));
    }

    static ArrayList<String> l = new ArrayList<>();

    public static String numberToWords(int num) {
        HashMap<Integer, String> dict = new HashMap<>();

        if (num == 0)
            return "Zero";

        dict.put(0, "");
        dict.put(1, "One");
        dict.put(2, "Two");
        dict.put(3, "Three");
        dict.put(4, "Four");
        dict.put(5, "Five");
        dict.put(6, "Six");
        dict.put(7, "Seven");
        dict.put(8, "Eight");
        dict.put(9, "Nine");
        dict.put(10, "Ten");
        dict.put(11, "Eleven");
        dict.put(12, "Twelve");
        dict.put(13, "Thirteen");
        dict.put(14, "Fourteen");
        dict.put(15, "Fifteen");
        dict.put(16, "Sixteen");
        dict.put(17, "Seventeen");
        dict.put(18, "Eighteen");
        dict.put(19, "Nineteen");
        dict.put(20, "Twenty");
        dict.put(30, "Thirty");
        dict.put(40, "Forty");
        dict.put(50, "Fifty");
        dict.put(60, "Sixty");
        dict.put(70, "Seventy");
        dict.put(80, "Eighty");
        dict.put(90, "Ninety");
        dict.put(100, "Hundred");
        dict.put(1000, "Thousand");
        dict.put(1000000, "Million");
        dict.put(1000000000, "Billion");

        Integer power = 0;
        for (int i = 0; i < 4; i++) {
            if (num % 1000 >= 1)
                l.add(dict.get(power));
            getNumInfo(num, dict);
            if (power == 0) {
                power = 1000;
            } else {
                power *= 1000;
            }
            num /= 1000;
        }

        l.removeAll(Arrays.asList(""));
        String output = "";
        for (int i = l.size() - 1; i >= 1; i--) {
            if (l.get(i) != "")
                output += l.get(i) + " ";
        }
        output += l.get(0);

        return output;
    }

    public static String getNumInfo(Integer num, HashMap<Integer, String> dict) {
        Integer tempNum = -1;
        String tempString = "";

        if ((num / 10) % 10 == 1) {
            tempNum = 10 + ((num) % 10);
            l.add(dict.get(tempNum));
        } else if ((num / 10) % 10 > 1) {
            l.add(dict.get((num) % 10));
            l.add(dict.get((num / 10) % 10 * 10));
        } else {
            l.add(dict.get((num) % 10));
        }

        if (((num / 100) % 10) >= 1) {
            l.add(dict.get(100));
        }
        l.add(dict.get(((num / 100) % 10)));

        return tempString;
    }
}
