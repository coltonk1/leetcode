class Solution {
    public int[] sortArray(int[] nums) {
        int[] result = new int[nums.length];
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int i : nums){
            queue.add(i);
        }
        for(int i = 0; i < nums.length; i++){
            result[i] = queue.poll();
        }
        return result;
    }
}