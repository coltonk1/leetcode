import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question881 {
    public static void main(String[] args) {
        Solution881 s = new Solution881();
        int[] people = {1,2,3,1,1,1,3,2,1,5,6,12,5,10};
        int limit = 15;
        int result = s.numRescueBoats(people, limit);
        System.out.println(result + " /r");
    }
}

class Solution881 {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        List<Integer> peopleList = new ArrayList<>();
        for (int person : people) {
            peopleList.add(person);
        }
        int totalBoats = 0;
        for(int i = peopleList.size()-1; i >= 0 && peopleList.size()>0; i--){
            int upper = peopleList.get(i);
            peopleList.remove(i);
            System.out.print(upper);
            for(int y = peopleList.size()-1; y >= 0 && peopleList.size()>0; y--){
                int combined = upper + peopleList.get(y);
                if(combined-limit <= 0) {
                    System.out.print(" : " + peopleList.get(y));
                    i--;
                    peopleList.remove(y);
                    break;
                }
            }
            System.out.println();
            totalBoats++;
        }
        return totalBoats;
    }
}
