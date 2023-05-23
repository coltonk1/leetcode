import java.util.Arrays;

//runtime: 17ms
//memory: 52.7MB

public class Question881 {
    public static void main(String[] args) {
        Solution881 s = new Solution881();
        int[] people = {3,3,4,5};
        int limit = 5;
        int result = s.numRescueBoats(people, limit);
        System.out.println(result);
    }
}

class Solution881 {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int totalBoats = 0;

        int lower = 0;
        int upper = people.length-1;
        while(lower<=upper){
            if(people[lower] + people[upper] <= limit){
                lower++;
            }
            upper--;
            totalBoats++;
        }

        return totalBoats;
    }
}
