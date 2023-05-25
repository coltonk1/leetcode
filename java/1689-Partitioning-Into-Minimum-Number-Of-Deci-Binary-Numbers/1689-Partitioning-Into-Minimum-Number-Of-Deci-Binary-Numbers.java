class Solution {
    public int minPartitions(String n) {
        int max = 0;
        for(char c : n.toCharArray()){
            max = Math.max(c-48, max);
        }
        return max;
    }
}