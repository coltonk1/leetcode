class Solution {
    public String licenseKeyFormatting(String s, int k) {
        s = s.toUpperCase().replaceAll("-", "");
        int end = (s.length()-1)/k;
        int initLength = s.length();
        for(int i = 1; i <= end; i++){
            s = s.substring(0, initLength-i*k) + "-" + s.substring(initLength-i*k, initLength+i-1);
        }
        return s;
    }
}