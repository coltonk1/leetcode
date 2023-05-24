class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int totalBoats = 0;

        int lower = 0;
        int upper = people.length-1;
        while(lower<=upper){
            int sum = people[lower] + people[upper];
            if(sum <= limit){
                lower++;
            }
            upper--;
            totalBoats++;
        }

        return totalBoats;
    }
}