class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int[] currentPos = points[0];
        int[] nextTarget = points[1];
        int index = 1;
        
        int seconds = 0;
        
        while(currentPos != points[points.length-1]){
            int xDif = nextTarget[0]-currentPos[0];
            int yDif = nextTarget[1]-currentPos[1];
            if(Math.abs(xDif) > Math.abs(yDif))
                seconds += Math.abs(xDif);
            else
                seconds += Math.abs(yDif);
            
            currentPos = nextTarget;
            index++;
            if(index < points.length)
                nextTarget = points[index];
        }
        
        return seconds;
    }
}