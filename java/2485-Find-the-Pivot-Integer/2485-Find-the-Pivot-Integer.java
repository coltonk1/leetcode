class Solution {
    public int pivotInteger(int n) {
        int endSum = 0;
        for(int i = 0; i <= n; i++){
            endSum += i;
        }
        int compSum = 0;
        for(int i = 0; i <= n; i++){
            compSum += i;
            if(endSum == compSum) return i;
            endSum -= i;
        }
        return -1;
    }
}