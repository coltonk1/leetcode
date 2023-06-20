class Solution {
    public int[] getAverages(int[] nums, int k) {
        int[] result = new int[nums.length];
        long sum = 0;
        if(nums.length == 1){
            if(k == 0) return nums;
            else{
                nums[0]=-1;
                return nums;
            }
        }
        if(k*2 >= nums.length){
            for(int i = 0; i < nums.length; i++){
                nums[i] = -1;
            }
            return nums;
        }
        for(int i = 0; i < k*2+1; i++){
            sum+=nums[i];
        }
        for(int i = 0; i < nums.length; i++){
            if(i < k || i > nums.length-k-1){
                result[i] = -1;
                continue;
            }
            result[i] = (int)(sum/(k*2+1));
            sum-=nums[i-k];
            if(i+k+1 < nums.length)
                sum+=nums[i+k+1];
        }
        return result;
    }
}