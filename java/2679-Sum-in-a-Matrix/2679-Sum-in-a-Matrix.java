class Solution {
    public int matrixSum(int[][] nums) {
        for(int i = 0; i < nums.length; i++){
            Arrays.sort(nums[i]);
        }

        int current = nums[0].length-1;
        int sum = 0;

        while(current != -1){
            int max = nums[0][current];
            for(int i = 1; i < nums.length; i++){
                max = Math.max(max, nums[i][current]);
            }
            sum+=max;
            current--;
        }

        return sum;
    }
}