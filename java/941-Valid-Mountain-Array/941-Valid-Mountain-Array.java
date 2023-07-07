class Solution {
    public boolean validMountainArray(int[] arr) {
        boolean inc = true;
        int prev = -1;
        if(arr.length == 1) return false;
        if(arr[1] <= arr[0]) return false;
        for(int i = 0; i < arr.length; i++){
            if(!inc && arr[i] > prev) return false;
            if(inc && arr[i] < prev) inc = false;
            if(arr[i] == prev) return false;
            prev = arr[i];
        }
        return !inc;
    }
}