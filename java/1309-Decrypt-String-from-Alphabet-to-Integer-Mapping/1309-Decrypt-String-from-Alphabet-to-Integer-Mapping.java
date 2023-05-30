class Solution {
    public String freqAlphabets(String s) {
        StringBuilder result = new StringBuilder("");
        char c = ' ';
        for(int i = s.length()-1; i >= 0; i--){
            if(s.charAt(i) != '#'){
                c = (char)(s.charAt(i)+'a'-49);
            }
            else{
                c = (char)(Integer.parseInt(s.substring(i-2, i))+'a'-1);
                i-=2;
            }
            result.insert(0, c);
        }
        return result.toString();
    }
}