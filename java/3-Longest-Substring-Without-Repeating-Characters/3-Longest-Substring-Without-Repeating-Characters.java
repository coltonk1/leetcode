class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) return 0;
        int max = 0;
        for(int left = 0, right = 0; right < s.length(); right++){
            int index = s.indexOf(s.charAt(right), left);
            if(index < right)
                left = index+1;
            max = Math.max(max, right-left+1);
        }
        return max;
    }
}