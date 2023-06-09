class Solution {
    public List<Integer> numOfBurgers(int tomatoSlices, int cheeseSlices) {

        double y = (cheeseSlices*4-tomatoSlices)/2d;
        double x = cheeseSlices-y;

        if(y % 1 != 0 || x < 0 || y < 0) return new ArrayList<>();
        List<Integer> solution = new ArrayList<>();
        solution.add((int)x);
        solution.add((int)y);
        return solution;
    
    }
}