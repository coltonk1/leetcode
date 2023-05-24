class Solution {
    public int minimumOperations(int[] nums) {
        Arrays.sort(nums);
        int unique = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != 0 && nums[i-1] != nums[i]){
                unique++;
            }
        }
        if(nums[0] != 0) 
        unique++;
        return unique;
    }
}