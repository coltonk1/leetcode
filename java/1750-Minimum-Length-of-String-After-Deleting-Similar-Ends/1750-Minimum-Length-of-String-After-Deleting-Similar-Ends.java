class Solution {
    public int minimumLength(String s) {
        int lower = 0;
        int upper = s.length()-1;
        char current = ' ';
        if(s.length() == 1)
            return 1;
        if(s.charAt(lower) == s.charAt(upper)){
            current = s.charAt(0);
        }
        else {
            return s.length();
        }
        while(lower < upper){
            boolean valid = true;
            if(s.charAt(lower) == current){
                lower++;
                valid = false;
            }
            if(s.charAt(upper) == current){
                upper--;
                valid = false;
            }
            if(!valid)
                continue;

            if(s.charAt(lower) == s.charAt(upper))
                current = s.charAt(lower);
            else
                return upper-lower+1;
        }
        if(upper == lower && s.charAt(upper) != current)
            return 1;
        return 0;
    }
}