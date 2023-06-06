class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        int total = 0;
        int pRight = players.length-1;
        int tRight = trainers.length-1;
        Arrays.sort(players);
        Arrays.sort(trainers);
        while(pRight >= 0 && tRight >= 0){
            if(players[pRight] <= trainers[tRight]){
                total++;
                pRight--;
                tRight--;
            }
            else pRight--;
        }
        return total;
    }
}