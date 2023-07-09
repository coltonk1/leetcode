class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        for(int i = shifts.length-2; i >= 0; i--){
            shifts[i] = (shifts[i]+shifts[i+1])%26;
        }
        StringBuilder output = new StringBuilder("");
        for(int i = 0; i < s.length(); i++){
            output.append((char)((((s.charAt(i) + shifts[i])-97)%26)+97));
        }
        return output.toString();
    }
}