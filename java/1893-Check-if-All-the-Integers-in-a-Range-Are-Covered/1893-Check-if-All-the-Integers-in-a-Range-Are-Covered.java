class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        PriorityQueue<Integer> nums = new PriorityQueue<Integer>();
        for(int i = 0; i < ranges.length; i++){
            for(int x = ranges[i][0]; x <= ranges[i][1]; x++){
                nums.offer(x);
            }
        }
        for(int x = left; x <= right; x++){
            if(!nums.contains(x)) return false;
        }
        return true;
    }
}