package Completed;
// A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

// Given a string s, return true if it is a palindrome, or false otherwise.

// Easy

public class Question125 {
    public static void main(String[] args) {
        String s = "!bHvX!?!!vHbX";
        Solution125 sol = new Solution125();
        boolean result = sol.isPalindrome(s);

        System.out.println(result);
    }
}

class Solution125 {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}