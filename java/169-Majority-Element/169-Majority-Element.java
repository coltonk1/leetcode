class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            m.put(nums[i], m.getOrDefault(nums[i], 0) + 1);
        }
        int max = 0;
        int key = 0;
        for(Map.Entry<Integer, Integer> entry : m.entrySet()){
            if(entry.getValue() > max){
                max = entry.getValue();
                key = entry.getKey();
            }
        }
        return key;
    }
}