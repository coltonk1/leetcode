class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> romans = new HashMap<Character, Integer>();
        romans.put('I', 1);
        romans.put('V', 5);
        romans.put('X', 10);
        romans.put('L', 50);
        romans.put('C', 100);
        romans.put('D', 500);
        romans.put('M', 1000);
        int result = 0;
        int previous = 0;
        for(int i = s.length()-1; i >= 0; i--){
            int current = romans.get(s.charAt(i));
            if(current >= previous){
                result+=current;
            }
            else{
                result-=current;
            }
            previous = current;
        }
        return result;
    }
}