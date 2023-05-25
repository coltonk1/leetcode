class Solution {
    public int minPartitions(String n) {
        for(int i = 9; i >= 2; i--){
            if(n.indexOf(String.valueOf(i)) != -1){
                return i;
            }
        }
        return 1;
    }
}