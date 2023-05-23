package Completed;
// Given an integer array nums of size n, return the minimum number of moves required to make all array elements equal.

// In one move, you can increment n - 1 elements of the array by 1.

// Medium

public class Question453 {
    public static void main(String[] args) {
        Solution453 s = new Solution453();
        int[] input = { 1, 2, 3 };
        int result = s.minMoves(input);
        System.out.println(result);
    }
}

class Solution453 {
    public int minMoves(int[] nums) {
        int sum = 0;
        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            int numIndex = nums[i];
            sum += numIndex;
            if (numIndex < min)
                min = numIndex;
        }
        sum += (1 - min) * nums.length;
        sum -= nums.length;
        return sum;
    }
}
