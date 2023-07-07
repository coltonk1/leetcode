class Solution {
    public int longestMountain(int[] arr) {
        int max = 0;
        if(arr.length == 1) return 0;
        boolean increasing = false;
        boolean valid = false;
        int start = 0;
        for(int i = 1; i < arr.length; i++){
            if(arr[i]>arr[i-1]){
                if(!increasing){
                    if(valid) max = Math.max(max, i-start);
                    start = i-1;
                }
                if(!valid)
                    start = i-1;
                increasing = true;
                valid = true;
            }
            else if(arr[i]==arr[i-1]){
                if(!increasing && valid){
                    max = Math.max(max, i-start);
                }
                valid = false;
            }
            else{
                increasing = false;
            }
        }
        if(!increasing && valid){
            max = Math.max(max, arr.length-start);
        }
        if(max == 1) return 0;
        return max;
    }
}