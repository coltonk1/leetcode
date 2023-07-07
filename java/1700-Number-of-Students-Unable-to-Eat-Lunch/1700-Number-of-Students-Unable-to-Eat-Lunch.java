class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Arrays.sort(students);
        List<Integer> sand = new ArrayList<>();
        List<Integer> stud = new ArrayList<>();
        for(int i : sandwiches) sand.add(i);
        for(int i : students) stud.add(i);
        int to = sandwiches.length;
        for(int i = 0; i < to; i++){
            int index = -1;
            if(stud.get(0) == sand.get(0)) index=0;
            else if(stud.get(stud.size()-1) == sand.get(0)) index=stud.size()-1;
            if(index < 0) break;
            stud.remove(index);
            sand.remove(0);
        }
        return stud.size();
    }
}