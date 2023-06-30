class Solution {
    boolean valid = false;
    public boolean canReach(int[] arr, int start) {
        Map<Integer, Integer> hash = new HashMap<Integer, Integer>();
        l(arr, start, hash);
        return valid;
    }
    public void l(int[] arr, int current, Map<Integer, Integer> hash){
        if(valid)
            return;
        if(hash.containsKey(current)) return;
        hash.put(current, 1);
        if(current >= arr.length || current < 0) return;
        if(arr[current] == 0) valid = true;
        l(arr, current+arr[current], hash);
        l(arr, current-arr[current], hash);
    }
}