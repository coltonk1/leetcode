package Completed;

import java.util.HashMap;

public class Question1 {
    public static void main(String[] args) {
        Solution1 s = new Solution1();
        int[] nums = { 3, 3 };
        int target = 6;
        int[] result = s.twoSum(nums, target);

        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}

class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> tm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int index = 0;
            int other = target - nums[i];
            if (tm.containsKey(other)) {
                index = tm.get(other);
                if (index != i) {
                    int[] result = { index, i };
                    return result;
                }
            }
            tm.put(nums[i], i);
        }
        return new int[0];
    }
}
