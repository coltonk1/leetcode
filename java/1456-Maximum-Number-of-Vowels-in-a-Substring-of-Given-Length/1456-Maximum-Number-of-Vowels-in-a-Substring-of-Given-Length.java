class Solution {
    public int maxVowels(String s, int k) {
        int amount = 0;

        for(int i = 0; i < k; i++){
            char c = s.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') amount++;
        }
        int max = amount;

        for(int i = k; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') amount++;
            c = s.charAt(i-k);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') amount--;
            max = Math.max(max, amount);
        }
        return max;
    }
}