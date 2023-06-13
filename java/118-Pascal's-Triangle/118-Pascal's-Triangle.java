class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < numRows; i++){
            List<Integer> inner = new ArrayList<>();
            List<Integer> previous = new ArrayList<>();
            if(result.size() != 0)
                previous = result.get(result.size()-1);
            for(int a = 0; a < i+1; a++){
                if(a == 0 || a == i)
                    inner.add(1);
                else{
                    inner.add(previous.get(a-1) + previous.get(a));
                }
            }
            result.add(inner);
        }
        return result;
    }
}