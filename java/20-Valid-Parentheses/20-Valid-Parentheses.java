class Solution {
    public boolean isValid(String s) {
        List<Character> previous = new ArrayList<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                previous.add(s.charAt(i));
            }
            else{  
                if(previous.size() > 0 && s.charAt(i) > previous.get(previous.size()-1) && s.charAt(i) < previous.get(previous.size()-1)+3){
                    previous.remove(previous.size()-1);
                }
                else
                    return false;
            }
        }
        
        return previous.size() == 0;
    }
}