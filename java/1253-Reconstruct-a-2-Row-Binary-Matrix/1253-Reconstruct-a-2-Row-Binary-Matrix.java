class Solution {
    public List<List<Integer>> reconstructMatrix(int uMax, int lMax, int[] c) {
        List<Integer> lower = new ArrayList<>();
        List<Integer> upper = new ArrayList<>();

        int lSum = 0;
        int uSum = 0;

        for(int i : c){
            if(i == 1){
                if(lMax-lSum>uMax-uSum){
                    lower.add(1);
                    upper.add(0);
                    lSum++;
                }
                else{
                    upper.add(1);
                    lower.add(0);
                    uSum++;
                }
            }
            else if(i == 2){
                upper.add(1);
                lower.add(1);
                uSum++;
                lSum++;
            }
            else{
                upper.add(0);
                lower.add(0);
            }
        }
        if(lSum != lMax || uSum != uMax)
            return new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        result.add(upper);
        result.add(lower);
        return result;
    }
}