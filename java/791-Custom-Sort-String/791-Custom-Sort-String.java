class Solution {
    public String customSortString(String order, String s) {
        StringBuilder output = new StringBuilder("");
        Map<Character, Integer> letters = new HashMap<Character, Integer>();
        for(char c : s.toCharArray()){
            letters.put(c, letters.getOrDefault(c, 0) + 1);
        }
        for(int i = 0; i < order.length(); i++){
            char c = order.charAt(i);
            for(int j = 0; j < letters.getOrDefault(c, 0); j++){
                output.append(c);
            }
        }
        output.append(s.replaceAll("["+order+"]", ""));
        return output.toString();
    }
}