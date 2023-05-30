class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] sArr = s.toCharArray();
        if(sArr.length == 0)
            return 0;
        int max = 0;
        int left = 0;
        boolean cont = true;
        while(cont){
            for(int i = left; i < sArr.length; i++){
                int index = s.indexOf(sArr[i], left);
                if(index < i){
                    max = Math.max(max, i-left);
                    left = index+1;
                    break;
                }
                if(i == sArr.length-1){
                    cont = false;
                    max = Math.max(max, i+1-left);
                }
            }
        }
        return max;
    }
}