class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> n1 = new HashSet<Integer>();
        Set<Integer> n2 = new HashSet<Integer>();
        List<Integer> result = new ArrayList<>();
        for(int i : nums1) {
            if(!n1.contains(i)) n1.add(i);
        }
        for(int i : nums2) {
            if(!n2.contains(i)) n2.add(i);
            else continue;
            if(n1.contains(i)) result.add(i);
        }
        int[] result_ = new int[result.size()];
        for(int i = 0; i < result_.length; i++){
            result_[i] = result.get(i);
        }
        return result_;
    }
}