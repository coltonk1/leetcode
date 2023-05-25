class Solution {
    public int minPartitions(String n) {
        int max = 0;
        for(int i = 9; i >= 0; i--){
            if(n.indexOf(i + "") > -1){
                return i;
            }
        }
        // for(char c : n.toCharArray()){
        //     max = Math.max(c-48, max);
        // }
        return max;
    }
}