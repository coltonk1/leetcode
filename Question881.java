import java.util.Arrays;

//runtime: 19ms
//memory: 53.7MB

public class Question881 {
    public static void main(String[] args) {
        Solution881 s = new Solution881();
        int[] people = {3,3,4,5};
        int limit = 5;
        int result = s.numRescueBoats(people, limit);
        System.out.println(result + " /r");
    }
}

class Solution881 {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int totalBoats = 0;

        int lower = 0;
        int upper = people.length-1;
        while(upper-lower > 0){
            if(people[lower] + people[upper] <= limit){
                lower++;
            }
            upper--;
            totalBoats++;
        }
        if(upper-lower==0){
            totalBoats++;
        }

//        List<Integer> peopleList = new ArrayList<>();
//        for(int i : people){
//            peopleList.add(i);
//        }
//
//        while(peopleList.size() > 1){
//            if(peopleList.get(0)+peopleList.get(peopleList.size()-1)<=limit){
//                peopleList.remove(peopleList.size()-1);
//                peopleList.remove(0);
//            }
//            else{
//                peopleList.remove(peopleList.size()-1);
//            }
//            totalBoats++;
//        }
//        if(peopleList.size() == 1)
//            totalBoats++;

        return totalBoats;
    }
}
