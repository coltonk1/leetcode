class Solution {
    public int longestPalindrome(String s) {
        s.toLowerCase();
        Map<Character, Integer> amount = new HashMap<>();
        for(char c : s.toCharArray()){
            amount.put(c, amount.getOrDefault(c, 0) + 1);
        }
        int extra = 0;
        int result = 0;
        for(Map.Entry<Character, Integer> entry : amount.entrySet()){
            int i = entry.getValue();
            if(i % 2 == 1)
                extra = 1;
            result += i/2;
        }
        result *= 2;
        result += extra;
        return result;
    }
}