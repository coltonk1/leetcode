class Solution {
    public int minMaxDifference(int num) {
        String maxNum = Integer.toString(num);
        String minNum = maxNum;
        for(int i = 0; i < maxNum.length(); i++){
            if(maxNum.charAt(i) != '9'){
                maxNum = maxNum.replaceAll(maxNum.charAt(i)+"", "9");
                break;
            }
        }
        minNum = minNum.replaceAll(minNum.charAt(0)+"", "0");
        return Integer.parseInt(maxNum)-Integer.parseInt(minNum);
    }
}