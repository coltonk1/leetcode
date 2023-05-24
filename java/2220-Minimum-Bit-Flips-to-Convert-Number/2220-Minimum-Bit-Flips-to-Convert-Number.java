class Solution {
    public int minBitFlips(int start, int goal) {
        int xor = start ^ goal;
        int amount = 0;
        while(xor > 1){
            amount += xor%2;
            xor/=2;
        }
        amount += xor;
        return amount;
    }
}