class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int[] sub : accounts){
            int amt = 0;
            for(int i : sub) amt+=i;
            max = Math.max(amt, max);
        }
        return max;
    }
}