class Solution {
    public boolean isNumber(String s) {
        if(s.length() > 1 && (s.charAt(0) == '-' || s.charAt(0) == '+')){
            if((s.charAt(1) < '0' || s.charAt(1) > '9') && s.charAt(1) != '.')
                return false;
            
            if(s.charAt(1) == '.'){
                if(s.length() <= 2)
                    return false;
                if(s.charAt(2) < '0' || s.charAt(2) > '9')
                    return false;
            }
        }
        if(s.length() == 1){
            return !(s.charAt(0) < '0' || s.charAt(0) > '9');
        }

        if(s.charAt(0) == '.' && (s.charAt(1) == 'e' || s.charAt(1) == 'E'))
            return false;
        int dotcount = 0;
        int ecount = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c >= '0' && c<='9')
                continue;
            else if(c == '-' || c == '+'){
                if(i == 0)
                    continue;
                if(s.charAt(i-1) == 'e' || s.charAt(i-1) == 'E')
                    continue;
                else
                    return false;
            }
            else if(i > 0 && (c == 'e' || c == 'E') && ecount == 0){
                ecount++;
                dotcount++;
            if(i == s.length()-1 || ((s.charAt(i-1) < '0' || s.charAt(i-1) > '9') && s.charAt(i-1) != '.'))
                return false;
            if(!(s.charAt(i+1) >= '0' && s.charAt(i+1) <= '9') && !(s.charAt(i+1) == '-' || s.charAt(i+1) == '+'))
                return false;

            if((s.charAt(i+1) == '-' || s.charAt(i+1) == '+')){
                if(i == s.length()-2)
                    return false;
                if(s.charAt(i+2) < '0' || s.charAt(i+2) > '9')
                    return false;
            }

            }
            else if(c == '.' && dotcount == 0){
                dotcount++;
                continue;
            }
            else
                return false;
        }
        return true;
    }
}