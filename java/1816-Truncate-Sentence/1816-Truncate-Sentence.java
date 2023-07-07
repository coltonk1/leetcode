class Solution {
    public String truncateSentence(String s, int k) {
        String[] args = s.split(" ");
        StringBuilder output = new StringBuilder("");
        for(int i = 0; i < k-1; i++){
            output.append(args[i]);
            output.append(" ");
        }
        output.append(args[k-1]);
        return output.toString();
    }
}