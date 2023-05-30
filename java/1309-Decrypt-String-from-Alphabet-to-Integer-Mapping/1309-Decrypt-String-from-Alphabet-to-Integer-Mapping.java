class Solution {
    public String freqAlphabets(String s) {
        StringBuilder result = new StringBuilder("");
        for(int i = s.length()-1; i >= 0; i--){
            char c = ' ';
            if(s.charAt(i) == '#'){
                c = (char)(Integer.parseInt(s.substring(i-2, i))+'a'-1);
                i-=2;
            }
            else
                c = (char)(Integer.parseInt(s.charAt(i)+"")+'a'-1);
            result.insert(0, c);
        }
        return result.toString();
    }
}