class Solution {
    public String licenseKeyFormatting(String s, int k) {
        s = s.toUpperCase().replaceAll("-", "");

        int end = (s.length()-1)/k;

        if(s.length() == 0)
            return "";

        int counter = 0;
        String result = s.charAt(s.length()-1)+"";
        for(int i = s.length()-2; i >= 0; i--){
            counter++;
            if(counter == k){
                result = s.charAt(i) + "-" + result;
                counter=0;
            }
            else
                result = s.charAt(i) + result;
        }
        return result;
    }
}