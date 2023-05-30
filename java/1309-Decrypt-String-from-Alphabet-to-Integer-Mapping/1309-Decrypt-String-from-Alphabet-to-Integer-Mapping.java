class Solution {
    public String freqAlphabets(String s) {
        String result = "";
        for(int i = s.length()-1; i >= 0; i--){
            if(s.charAt(i) == '#'){
                char c = (char)(Integer.parseInt(s.substring(i-2, i))+'a'-1);
                result = c + result;
                i-=2;
            }
            else{
                char c = (char)(Integer.parseInt(s.charAt(i)+"")+'a'-1);
                result = c + result;
            }
        }
        return result;
    }
}