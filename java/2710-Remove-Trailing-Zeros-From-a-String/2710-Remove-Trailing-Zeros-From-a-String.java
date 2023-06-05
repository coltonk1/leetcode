class Solution {
    public String removeTrailingZeros(String num) {
        int left = 0;
        int right = 0;

        for(int i = 0; i < num.length(); i++){
            if(num.charAt(i) != '0'){
                left = i;
                break;
            }
        }
        for(int i = num.length()-1; i >= 0; i--){
            if(num.charAt(i) != '0'){
                right = i+1;
                break;
            }
        }

        return num.substring(left, right);
    }
}