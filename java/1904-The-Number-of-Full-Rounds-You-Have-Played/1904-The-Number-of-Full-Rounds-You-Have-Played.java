class Solution {
    public int numberOfRounds(String loginTime, String logoutTime) {
        int startTime = Integer.parseInt(loginTime.substring(0, 2))*60+Integer.parseInt(loginTime.substring(3,5));
        int endTime = Integer.parseInt(logoutTime.substring(0, 2))*60+Integer.parseInt(logoutTime.substring(3,5));
        if(endTime < startTime) endTime += 60*24;
        startTime += startTime%15!=0?15-startTime%15:0;
        endTime -= endTime%15;
        int result = (endTime-startTime)/15;
        if(result < 0) return 0;
        return result;
    }
}