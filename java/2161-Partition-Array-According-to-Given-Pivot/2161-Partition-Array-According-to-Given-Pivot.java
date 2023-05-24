class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> below = new ArrayList<Integer>();
        Integer between = 0;
        ArrayList<Integer> above = new ArrayList<Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < pivot)
                below.add(nums[i]);
            else if (nums[i] > pivot)
                above.add(nums[i]);
            else
                between++;
        }

        int[] tempNums = new int[nums.length];
        for (int i = 0; i < below.size(); i++) {
            tempNums[i] = below.get(i);
        }
        for (int i = below.size(); i < below.size() + between; i++) {
            tempNums[i] = pivot;
        }
        for (int i = 0; i < above.size(); i++) {
            tempNums[i + below.size() + between] = above.get(i);
        }
        nums = tempNums;
        return nums;
    }
}