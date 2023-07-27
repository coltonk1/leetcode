class Solution {
    public int findMiddleIndex(int[] nums) {
        int frontTotal = 0;
        for(int i = 0; i < nums.length; i++){
            frontTotal += nums[i];
        }
        int backTotal = 0;
        for(int i = 0; i < nums.length; i++){
            frontTotal -= nums[i];
            if(frontTotal == backTotal) return i;
            backTotal += nums[i];
        }
        return -1;
    }
}
