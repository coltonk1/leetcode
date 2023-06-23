class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int sum = 0;
        int lines = 0;
        for(int i = 0; i < s.length(); i++){
            sum += widths[(int)s.charAt(i)-97];
            if(sum > 100){
                lines++;
                sum -= (sum-widths[(int)s.charAt(i)-97]);
            }
        }
        if(sum != 0) lines++;
        int[] result = new int[]{lines, sum};
        return result;
    }
}