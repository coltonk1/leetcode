class Combination {
    public int plantTime;
    public int growTime;

    Combination(int plantTime, int growTime){
        this.plantTime = plantTime;
        this.growTime = growTime;
    }
}

class Solution {
    public int earliestFullBloom(int[] plantTime, int[] growTime) {
        Combination[] bothArrays = new Combination[plantTime.length];
        for(int i = 0; i < bothArrays.length; i++){
            bothArrays[i] = new Combination(plantTime[i], growTime[i]);
        }
        Arrays.sort(bothArrays, (a,b)->b.growTime-a.growTime);
        
        int max = 0;
        int currentDay = -1;
        for(Combination c : bothArrays){
            currentDay += c.plantTime;
            if(currentDay + c.growTime + 1 > max){
                max = currentDay + c.growTime + 1;
            }
        }

        return max;
    }
}