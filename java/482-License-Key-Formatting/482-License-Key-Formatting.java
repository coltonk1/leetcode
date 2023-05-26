class Solution {
    public String licenseKeyFormatting(String s, int k) {
        s = s.toUpperCase().replaceAll("-", "");

        int end = (s.length()-1)/k;

        if(s.length() == 0)
            return "";
        String result = s.charAt(s.length()-1)+"";
        for(int i = s.length()-2; i >= 0; i--){
            if(((s.length()-i-1)%k) == 0){
                result = s.charAt(i) + "-" + result;
            }
            else
                result = s.charAt(i) + result;
        }
        return result;
    }
}