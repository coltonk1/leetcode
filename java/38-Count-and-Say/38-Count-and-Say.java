class Solution {
    public String countAndSay(int n) {
        if(n == 1) return "1";
        String current = "1";
        for(int i = 0; i < n-1; i++){
            current = say(current);
        }
        return current;
    }

    public String say(String s){
        String result = "";
        int amt = 1;
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i-1) == s.charAt(i)) amt++;
            else{
                result += amt + "" + s.charAt(i-1);
                amt = 1;
            }
        }
        result += amt + "" + s.charAt(s.length()-1);
        System.out.println(result);
        return result;
    }
}