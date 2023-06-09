class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.length() == 1) return true;
        if((word.charAt(0) >= 'A' && word.charAt(0) <= 'Z') && (word.charAt(1) >= 'A' && word.charAt(1) <= 'Z')){
            for(int i = 0; i < word.length(); i++){
                if((word.charAt(i) < 'A' || word.charAt(i) > 'Z'))
                    return false;
            }
        }
        else{
            for(int i = 1; i < word.length(); i++){
                if((word.charAt(i) < 'a' || word.charAt(i) > 'z'))
                    return false;
            }
        }
        return true;
    }
}