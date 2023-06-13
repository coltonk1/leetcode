class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        for(int[] i : grid){
            for(int a : i){
                if(a < 0)
                    count++;
            }
        }
        return count;
    }
}