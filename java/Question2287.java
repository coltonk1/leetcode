package Completed;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// You are given two 0-indexed strings s and target. You can take some letters from s and rearrange them to form new strings.

// Return the maximum number of copies of target that can be formed by taking letters from s and rearranging them.

// Easy

public class Question2287 {
    public static void main(String[] args) {
        Solution2287 sol = new Solution2287();
        String s = "aaaaaaaaaaa";
        String target = "aaaaa";
        int result = sol.rearrangeCharacters(s, target);
        System.out.println(result);
    }
}

class Solution2287 {
    public int rearrangeCharacters(String s, String target) {
        List<String> sA = new ArrayList<>(Arrays.asList(s.split("")));
        List<String> tA = new ArrayList<>(Arrays.asList(target.split("")));
        int[] amounts = new int[tA.size()];
        boolean valid = true;
        while (valid) {
            for (int i = 0; i < tA.size() && valid; i++) {
                if (sA.indexOf(tA.get(i)) >= 0) {
                    amounts[i]++;
                    sA.remove(tA.get(i));
                } else {
                    valid = false;
                }
            }
        }
        int min = amounts[0];
        for (int i = 1; i < amounts.length; i++) {
            if (amounts[i] < min)
                min = amounts[i];
        }
        return min;
    }
}
