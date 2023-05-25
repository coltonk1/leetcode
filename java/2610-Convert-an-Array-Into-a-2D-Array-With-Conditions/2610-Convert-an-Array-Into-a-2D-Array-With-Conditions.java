class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        while(true){
            List<Integer> sub = new ArrayList<>();
            for(int i = 0; i < nums.length; i++){
                if(nums[i] != 0 && sub.indexOf(nums[i]) == -1){
                    sub.add(nums[i]);
                    nums[i] = 0;
                }
            }
            if(sub.size() == 0)
                break;
            result.add(sub);
        }
        

        return result;
    }
}