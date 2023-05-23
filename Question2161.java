package Completed;
// You are given a 0-indexed integer array nums and an integer pivot. Rearrange nums such that the following conditions are satisfied:

// Every element less than pivot appears before every element greater than pivot.
// Every element equal to pivot appears in between the elements less than and greater than pivot.
// The relative order of the elements less than pivot and the elements greater than pivot is maintained.
// More formally, consider every pi, pj where pi is the new position of the ith element and pj is the new position of the jth element. For elements less than pivot, if i < j and nums[i] < pivot and nums[j] < pivot, then pi < pj. Similarly for elements greater than pivot, if i < j and nums[i] > pivot and nums[j] > pivot, then pi < pj.
// Return nums after the rearrangement.

// Medium

import java.util.ArrayList;

public class Question2161 {
    public static void main(String[] args) {
        int[] a = { -3, 4, 3, 2 };
        int pivot = 2;
        Solution2161 s = new Solution2161();
        int[] result = s.pivotArray(a, pivot);
        System.out.println();
        for (int i = 0; i < result.length - 1; i++) {
            System.out.print(result[i] + ", ");
        }
        System.out.print(result[result.length - 1]);
    }
}

class Solution2161 {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> below = new ArrayList<Integer>();
        Integer between = 0;
        ArrayList<Integer> above = new ArrayList<Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < pivot)
                below.add(nums[i]);
            else if (nums[i] > pivot)
                above.add(nums[i]);
            else
                between++;
        }

        int[] tempNums = new int[nums.length];
        for (int i = 0; i < below.size(); i++)
            tempNums[i] = below.get(i);
        for (int i = below.size(); i < below.size() + between; i++)
            tempNums[i] = pivot;
        for (int i = 0; i < above.size(); i++)
            tempNums[i + below.size() + between] = above.get(i);
        return tempNums;
    }
}