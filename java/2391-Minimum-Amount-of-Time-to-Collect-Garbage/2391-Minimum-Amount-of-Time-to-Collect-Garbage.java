class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        // one garbage collection is 1 minute
        // travel i is time to go from house i to house i + 1
        int total = 0;
        int maxG = 0;
        int maxP = 0;
        int maxM = 0;
        for(int i = 0; i < garbage.length; i++){
            if(garbage[i].contains("G")) maxG = i;
            if(garbage[i].contains("P")) maxP = i;
            if(garbage[i].contains("M")) maxM = i;
        }
        
        for(int i = 0; i < garbage.length; i++){
            total+=garbage[i].length();
            if(i == garbage.length-1) break;
            if(i < maxG)
            total+=travel[i];
            if(i < maxP)
            total+=travel[i];
            if(i < maxM)
            total+=travel[i];
        }
        return total;
    }
}