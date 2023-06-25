class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int result = 0;
        while(mainTank > 0){
            if(mainTank >= 5){
                result += 5;
                mainTank -= 5;
                if(additionalTank > 0){
                    additionalTank -= 1;
                    mainTank += 1;
                }
            }
            else{
                result += mainTank;
                mainTank = 0;
            }
        }
        return result*10;
    }
}