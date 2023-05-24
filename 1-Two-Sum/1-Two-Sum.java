class Solution {
   public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> tm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int index = 0;
            int other = target - nums[i];
            if (tm.containsKey(other)) {
                index = tm.get(other);
                if (index != i) {
                    int[] result = {index, i};
                    return result;
                }
            }
            tm.put(nums[i], i);
        }
        return new int[0];
    }
}