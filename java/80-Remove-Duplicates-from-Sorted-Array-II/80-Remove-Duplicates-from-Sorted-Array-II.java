class Solution {
    public int removeDuplicates(int[] nums) {
        int counter = 0;
        int offset = 0;
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i]==nums[i+1]){
                if(counter == 0){
                    counter++;
                    nums[i+offset] = nums[i];
                }
                else{
                    offset--;
                }
            }
            else{
                counter=0;
                nums[i+offset]=nums[i];
            }
        }
        nums[nums.length-1+offset] = nums[nums.length-1];
        return nums.length+offset;
    }
}