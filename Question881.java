import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question881 {
    public static void main(String[] args) {
        Solution881 s = new Solution881();
        int[] people = {5,1,4,2,6,6,6};
        int limit = 6;
        int result = s.numRescueBoats(people, limit);
        System.out.println(result + " /r");
    }
}

class Solution881 {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int totalBoats = 0;

        List<Integer> peopleList = new ArrayList<>();
        for(int i : people){
            peopleList.add(i);
        }

        while(peopleList.size() > 1){
            if(peopleList.get(0)+peopleList.get(peopleList.size()-1)<=limit){
                peopleList.remove(peopleList.size()-1);
                peopleList.remove(0);
            }
            else{
                peopleList.remove(peopleList.size()-1);
            }
            totalBoats++;
        }
        if(peopleList.size() == 1)
            totalBoats++;

        return totalBoats;
    }
}
