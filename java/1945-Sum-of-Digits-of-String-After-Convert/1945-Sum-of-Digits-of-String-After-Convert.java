class Solution {
    public int getLucky(String s, int k) {
        int sum = 0;
        for(int i = 0; i < s.length(); i++){
            String r = Integer.toString(s.charAt(i)-96);
            for(int j = 0; j < r.length(); j++){
                sum += (int)r.charAt(j)-48;
            }
        }

        for(int i = 0; i < k-1; i++){
            String r = Integer.toString(sum);
            sum = 0;
            for(int j = 0; j < r.length(); j++){
                sum += (int)r.charAt(j)-48;
            }
            
        }
        return sum;
    }
}