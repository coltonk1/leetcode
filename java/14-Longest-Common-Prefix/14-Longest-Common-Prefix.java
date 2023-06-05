class Solution {
    public String longestCommonPrefix(String[] strs) {
        int right = 0;
        int smallest = strs[0].length();
        int largest = 0;
        for(String s : strs){
            smallest = Math.min(smallest, s.length());
            largest = Math.max(largest, s.length());
        }
        for(int i = 0; i < smallest; i++){
            right++;
            char c = strs[0].charAt(i);
            for(String s : strs){
                if(s.charAt(i) != c) {
                    i+=smallest;
                    right--;
                    break;
                }
            }
        }
        if(right < 0) right = 0;
        return strs[0].substring(0, right);
    }
}