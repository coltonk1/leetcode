class Solution {
    public int maximumTop(int[] nums, int k) {
        if(nums.length == 1 && k%2==1) return -1;
        if(k==0) return nums[0];
        
        int max = 0;
        for(int i = 0; i < Math.min(nums.length, k-1); i++){
            max = Math.max(max, nums[i]);
        }
        if(k >= 1 && nums.length > k && max < nums[k])
            max = nums[k];
        return max;
    }
}