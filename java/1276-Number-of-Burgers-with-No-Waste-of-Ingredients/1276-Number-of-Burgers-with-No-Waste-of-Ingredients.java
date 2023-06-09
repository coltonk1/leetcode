class Solution {
    public List<Integer> numOfBurgers(int tomatoSlices, int cheeseSlices) {

        int y = (cheeseSlices*4-tomatoSlices);
        if(y % 2 != 0) return new ArrayList<>();
        y /= 2;
        int x = cheeseSlices-y;

        if(x < 0 || y < 0) return new ArrayList<>();
        List<Integer> solution = new ArrayList<>();
        solution.add(x);
        solution.add(y);
        return solution;
    
    }
}