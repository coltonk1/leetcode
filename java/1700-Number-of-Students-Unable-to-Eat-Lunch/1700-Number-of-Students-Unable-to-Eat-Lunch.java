class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        List<Integer> sand = new ArrayList<>();
        List<Integer> stud = new ArrayList<>();
        for(int i : sandwiches) sand.add(i);
        for(int i : students) stud.add(i);
        int to = sandwiches.length;
        for(int i = 0; i < to; i++){
            int index = stud.indexOf(sand.get(0));
            if(index < 0) break;
            stud.remove(index);
            sand.remove(0);
        }
        return stud.size();
    }
}