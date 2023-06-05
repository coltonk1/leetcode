class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> mag = new HashMap<Character, Integer>();
        Map<Character, Integer> ransom = new HashMap<Character, Integer>();

        for(char c : magazine.toCharArray()){
            mag.put(c, mag.getOrDefault(c, 0) + 1);
        }
        for(char c : ransomNote.toCharArray()){
            ransom.put(c, ransom.getOrDefault(c, 0) + 1);
        }

        for ( Map.Entry<Character, Integer> entry : ransom.entrySet()) {
            if(mag.getOrDefault(entry.getKey(), 0) < entry.getValue()) return false;
        }
        return true;
    }
}