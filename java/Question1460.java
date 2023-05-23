package Completed;

import java.util.Arrays;

// You are given two integer arrays of equal length target and arr. In one step, you can select any non-empty subarray of arr and reverse it. You are allowed to make any number of steps.

// Return true if you can make arr equal to target or false otherwise.

// Easy

public class Question1460 {
    public static void main(String[] args) {
        Solution1460 s = new Solution1460();
        int[] target = { 3, 7, 9 };
        int[] arr = { 3, 7, 9 };
        boolean result = s.canBeEqual(target, arr);
        System.out.println(result);
    }
}

class Solution1460 {
    public boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);
        return Arrays.equals(arr, target);
    }
}
