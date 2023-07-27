    public int findMiddleIndex(int[] nums) {
        int frontTotal = 0;
        for(int i = 0; i < nums.length; i++){
            frontTotal += nums[i];
        }
        for(int i = 0; i < nums.length; i++){
            frontTotal -= nums[i];
        }
    }
        int backTotal = 0;
            backTotal += nums[i];
            if(frontTotal == backTotal) return i;
        return -1;
}
class Solution {
