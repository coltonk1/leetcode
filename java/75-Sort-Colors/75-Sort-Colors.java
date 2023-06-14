class Solution {
    public void sortColors(int[] nums) {
        int[] colors = new int[3];
        for(int i = 0; i < nums.length; i++){
            colors[nums[i]]++;
        }
        int start = 0;
        for(int i = 0; i < 3; i++){
            if(i != 0) start += colors[i-1];
            for(int j = 0; j < colors[i]; j++){
                nums[j+start] = i;
            }
        }
    }
}