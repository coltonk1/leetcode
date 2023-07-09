class Solution {
    public int minAddToMakeValid(String s) {
        int amount = 0;
        int output = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(') amount++;
            else if(s.charAt(i) == ')'){
                amount--;
                if(amount < 0){
                    amount++;
                    output++;
                }
            }
        }
        return output+Math.abs(amount);
    }
}