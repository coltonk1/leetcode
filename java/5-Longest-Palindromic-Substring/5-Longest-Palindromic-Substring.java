class Solution {
    public String longestPalindrome(String s) {
        String result = "";
        for(int x = s.length(); x >= 1; x--){
            for(int y = 0; y < x; y++){
                if(x-y < result.length())
                    break;
                String temp = s.substring(y, x);
                if(isPalindrome(temp)){
                    if(temp.length() > result.length())
                        result = temp;
                }
            }
        }
        return result;
    }

    public boolean isPalindrome(String s){
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}