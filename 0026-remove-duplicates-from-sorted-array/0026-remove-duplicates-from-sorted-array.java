class Solution {
    public int removeDuplicates(int[] nums) {
        int amount = 1;
        int previous = nums[0];
        List<Integer> numList = new ArrayList<>();
        numList.add(previous);
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != previous){
                previous = nums[i];
                numList.add(previous);
                amount++;
            }
        }
        int[] result = new int[amount];
        for(int i = 0; i < result.length; i++){
            nums[i] = numList.get(i);
        }
        return amount;
    }
}