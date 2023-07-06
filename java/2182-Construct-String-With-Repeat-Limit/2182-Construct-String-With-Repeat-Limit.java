class Solution {
    public String repeatLimitedString(String s, int repeatLimit) {
        Map<Character, Integer> letterCount = new HashMap<Character, Integer>();
        for(int i = 0; i < s.length(); i++){
            letterCount.put(s.charAt(i), letterCount.getOrDefault(s.charAt(i), 0) + 1);
        }
        char previous = '0';
        char current = '1';
        StringBuilder result = new StringBuilder("");
        while(true){
            int max = 0;
            for(Map.Entry<Character, Integer> entry : letterCount.entrySet()){
                char key = entry.getKey();
                if(key != previous && key > max && entry.getValue() > 0){
                    current = key;
                    max = (int)key;
                }
            }
            if(previous == current) break;
            int currentValue = letterCount.get(current);
            if(previous > current && letterCount.get(previous) > 0){
                result.append(current);
                letterCount.put(current, currentValue-1);
            }
            else{
                for(int i = 0; i < Math.min(currentValue, repeatLimit); i++){
                    result.append(current);
                }
                letterCount.put(current, currentValue-Math.min(currentValue, repeatLimit));
            }
            previous = current;
        }
        return result.toString();
    }
}