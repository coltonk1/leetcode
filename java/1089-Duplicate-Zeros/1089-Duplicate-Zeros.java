class Solution {
    public void duplicateZeros(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                for(int x = i, temp = 0, temp2 = 0; x < arr.length; x++){
                    temp2 = arr[x];
                    arr[x] = temp;
                    temp = temp2;
                }
                i++;
            }
        }
    }
}