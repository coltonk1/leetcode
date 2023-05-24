class Solution {
    public int minMoves(int[] nums) {
        int trueSum = 0;
        int trueMin = nums[0];
        for (int i = 0; i < nums.length; i++) {
            int numIndex = nums[i];
            trueSum += numIndex;
            if (numIndex < trueMin)
                trueMin = numIndex;
        }
        trueSum += (1 - trueMin) * nums.length;
        trueSum -= nums.length;
        return trueSum;
    }
}