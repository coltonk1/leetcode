class Solution {
    public int maximizeSum(int[] nums, int k) {
        int max = 0;
        for(int i = 0; i < nums.length; i++){
            max = Math.max(nums[i], max);
        }
        int result = max*k;
        int difference = 0;
        for(int i = 0; i < k; i++){
            result+=difference;
            difference++;
        }
        return result;
    }
}