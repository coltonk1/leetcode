class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int median = nums[nums.length/2];
        int result = 0;
        for(int i : nums) result += Math.abs(i-median);
        return result;
    }
}