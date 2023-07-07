class Solution {
    public int longestMountain(int[] arr) {
        if(arr.length == 1) return 0;
        int max = 0;
        boolean increasing = false;
        boolean valid = false;
        int startIndex = 0;
        for(int i = 1; i < arr.length; i++){
            if(arr[i]>arr[i-1]){
                if(!increasing && valid) max = Math.max(max, i-startIndex);
                if(!valid || !increasing) startIndex = i-1;
                increasing = true;
                valid = true;
            }
            else if(arr[i]==arr[i-1]){
                if(!increasing && valid) max = Math.max(max, i-startIndex);
                valid = false;
            }
            else increasing = false;
        }
        if(!increasing && valid) max = Math.max(max, arr.length-startIndex);
        return max<=1?0:max;
    }
}