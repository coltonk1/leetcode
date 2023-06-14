class Solution {
    public void rotate(int[] nums, int k) {
        //i know a better in-place solution -- too tired rn
        //for future me | just follow
        while(k > nums.length) k-=nums.length;
        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            int target = i+k;
            if(target >= nums.length) target-=nums.length;
            result[target] = nums[i];
        }
        for(int i = 0; i < nums.length; i++){
            nums[i] = result[i];
        }
    }
}