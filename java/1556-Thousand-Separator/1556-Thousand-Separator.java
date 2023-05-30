class Solution {
    public String thousandSeparator(int n) {
        String s = Integer.toString(n);
        String result = "";
        for(int i = s.length()-1; i >= 0; i--){
            if((s.length()-i)%3 == 0 && i!=0)
                result = "." + s.charAt(i) + result;
            else{
                result = s.charAt(i) + result;
            }
        }
        return result;
    }
}