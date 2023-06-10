class Solution {
    public int[] numberOfPairs(int[] nums) {
        Map<Integer, Integer> numMap = new HashMap<Integer, Integer>();
        for(int i : nums){
            numMap.put(i, numMap.getOrDefault(i, 0) + 1);
        }
        int total = 0;
        int remaining = 0;
        for(int i : numMap.values()){
            total += i/2;
            remaining += i%2;
        }
        return new int[]{total, remaining};
    }
}