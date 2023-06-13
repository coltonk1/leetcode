class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int pointer1 = 0;
        int pointer2 = 0;
        int[] nums3 = new int[m+n];
        while(true){
            if(pointer1 < m && pointer2 < n){
                if(nums1[pointer1] < nums2[pointer2]){
                    nums3[pointer1+pointer2] = nums1[pointer1];
                    pointer1++;
                }
                else{
                    nums3[pointer1+pointer2] = nums2[pointer2];
                    pointer2++;
                }
            }
            else if(pointer1 < m){
                nums3[pointer1+pointer2] = nums1[pointer1];
                pointer1++;
            }
            else if(pointer2 < n){
                nums3[pointer1+pointer2] = nums2[pointer2];
                pointer2++;
            }
            else{
                break;
            }
        }
        for(int i = 0; i < nums3.length; i++){
            nums1[i] = nums3[i];
        }
    }
}