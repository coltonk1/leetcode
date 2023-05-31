class Solution {
    public boolean canJump(int[] nums) {
        for(int i = nums.length-2, current = nums.length-1; i >= 0; i--){
            if(nums[i] >= current-i){
                current = i;
            }
            if(i == 0 && current != 0){
                return false;
            }
        }
        return true;
    }
}