class Solution {
    public int kthFactor(int n, int k) {
        int iterations = 0;
        for(int i = 1; i <= n; i++){
            if(n%i==0){
                iterations++;
                if(iterations==k)
                    return i;
            }
        }
        return -1;
    }
}