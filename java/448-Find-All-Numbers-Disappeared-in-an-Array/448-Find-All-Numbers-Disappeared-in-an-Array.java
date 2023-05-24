class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        List<Integer> result = new ArrayList<>();
        for(int i = 1; i < nums.length+1; i++){
            if(Arrays.binarySearch(nums, i) < 0){
                result.add(i);
            }
        }
        return result;
    }
}