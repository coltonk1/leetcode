class Solution {
    public int minPairSum(int[] nums) {
        List<Integer> numbers = new ArrayList<>();
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length-1;
        int max = 0;
        while(left < right){
            max = Math.max(nums[left]+nums[right],max);
            left++;
            right--;
        }
        return max;
    }
}