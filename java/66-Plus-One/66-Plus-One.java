class Solution {
    public int[] plusOne(int[] digits) {
        if(digits[digits.length-1] != 9)
        {
            int[] result = new int[digits.length];
            for(int i = 0; i < digits.length; i++){
                result[i] = digits[i];
            }
            result[result.length-1]++;
            return result;
        }

        for(int i = digits.length-1; i >= -1; i--){
            if(i == -1){
                int[] result = new int[digits.length+1];
                for(int a = 0; a < digits.length; a++){
                    result[a+1] = digits[a];
                }
                result[0] = 1;
                return result;
            }
            if(digits[i] == 9){
                digits[i] = 0;
                continue;
            }
            else{
                digits[i]++;
                return digits;
            }
        }
        return null;
    }
}