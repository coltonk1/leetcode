class Solution {
    public boolean canReach(int[] arr, int current) {
        if(current >= arr.length || current < 0 || arr[current] < 0) return false;
        arr[current] = -arr[current];
        if(arr[current] == 0) return true;
        return canReach(arr, current+arr[current]) || canReach(arr, current-arr[current]);
    }
}