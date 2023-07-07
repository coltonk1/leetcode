class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        List<Character> letters = new ArrayList<Character>();
        for(char c : allowed.toCharArray()){
            letters.add(c);
        }
        int amt = 0;
        for(String s : words){
            amt++;
            for(int i = 0; i<s.length(); i++){
                if(letters.indexOf(s.charAt(i)) < 0){
                    amt--;
                    break;
                }
            }
        }
        return amt;
    }
}