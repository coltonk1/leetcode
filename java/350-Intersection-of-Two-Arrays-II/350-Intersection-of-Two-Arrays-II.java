class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> n1 = new HashMap<Integer, Integer>();
        Map<Integer, Integer> n2 = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums1.length; i++){
            n1.put(nums1[i], n1.getOrDefault(nums1[i], 0) + 1);
        }
        for(int i = 0; i < nums2.length; i++){
            n2.put(nums2[i], n2.getOrDefault(nums2[i], 0) + 1);
        }
        List<Integer> result = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : n1.entrySet()){
            for(int i = 0; i < Math.min(entry.getValue(), n2.getOrDefault(entry.getKey(), 0)); i++){
                result.add(entry.getKey());
            }
        }
        int[] res = new int[result.size()];
        for(int i =0 ; i < result.size() ; i++){
            res[i] = result.get(i);
        }
        return res;
    }
}