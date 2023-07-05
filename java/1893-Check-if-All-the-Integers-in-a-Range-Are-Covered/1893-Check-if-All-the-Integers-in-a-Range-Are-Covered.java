class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        int max = -1;
        for(int i = 0; i < ranges.length; i++){
            if(ranges[i][0] <= left && ranges[i][1] >= left) max = ranges[i][1];
        }
        while(max < right){
            boolean valid = false;
            for(int[] i : ranges){
                if(i[0] <= max+1 && i[1] >= max+1){
                    max = i[1];
                    valid = true;
                    break;
                }
            }
            if(!valid) return false;
        }
        return true;
    }
}