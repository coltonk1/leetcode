class Solution {
    public String reformat(String s) {
        List<Character> digits = new ArrayList<>();
        List<Character> letters = new ArrayList<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
                letters.add(s.charAt(i));
            else
                digits.add(s.charAt(i));
        }
        String result = "";
        if(digits.size()-1 > letters.size() || digits.size()+1 < letters.size())
            return "";
        if(digits.size() > letters.size()){
            result+=digits.get(0);
            for(int i = 0; i < letters.size(); i++){
                result += letters.get(i);
                result += digits.get(i+1);
            }
        }
        else if(letters.size() > digits.size()){
            result += letters.get(0);
            for(int i = 0; i < digits.size(); i++){
                result += digits.get(i);
                result += letters.get(i+1);
            }
        }
        else{
            for(int i = 0; i < digits.size(); i++){
                result += digits.get(i);
                result += letters.get(i);
            }
        }
        return result;

    }
}