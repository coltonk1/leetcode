class Solution {
    public int myAtoi(String s) {
        int lastIndex = s.length();

        int startIndex = -1;
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(startIndex == -1 && (c == '-' || c == '+')){
                startIndex = i;
                continue;
            }
            if(c == ' ' && startIndex == -1)
                continue;
            if((c < '0' || c > '9')){
                lastIndex = i;
                break;
            }
            if(startIndex == -1)
                startIndex = i;
        }

        if(startIndex == -1) return 0;
        String sub = s.substring(startIndex, lastIndex);
        if(sub.equals("+") || sub.equals("-") || sub.equals("")) return 0;
        boolean negative = sub.charAt(0) == '-';
        startIndex = 0;
        for(int i = 0; i < sub.length(); i++){
            char c = sub.charAt(i);
            if(c == '0' || c == '-' || c == '+') continue;
            startIndex = i;
            break;
        }
        int endIndex = startIndex+12;
        if(endIndex > sub.length())
            endIndex = sub.length();
        if(sub.length() > 11){
            sub = (negative ? "-" : "") + sub.substring(startIndex, endIndex);
        }
        long result = Long.parseLong(sub);

        if(result < Integer.MIN_VALUE) 
            return Integer.MIN_VALUE;
        else if(result > Integer.MAX_VALUE) 
            return Integer.MAX_VALUE;

        return (int)result;
    }
}