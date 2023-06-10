class Solution {
    public List<String> letterCombinations(String digits) {
        d(digits,"",0);
        if(result.size() == 1) return new ArrayList<>();
        return result;
    }

    List<String> result = new ArrayList<>();

    public char[] charsInNum(int digit){
        digit -= 2;
        char[] c = new char[0];
        if(digit == 5 || digit == 7){
            c = new char[4];
        }
        else{
            c = new char[3];
        }
        digit *= 3;
        if(digit/3+2 >= 8) digit++;
        digit += 97;
        for(int i = 0; i < c.length; i++, digit++){
            c[i] = (char)digit;
        }
        return c;
    }

    public void d(String digits, String current, int a){
        if(a == digits.length()){
            result.add(current);
            return;
        }
        char[] c = charsInNum(digits.charAt(a)-48);
        for(int i = 0; i < c.length; i++){
            d(digits,current+c[i],a+1);
        }
    }
}