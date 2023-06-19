class Solution {
    List<String> result;
    public List<String> generateParenthesis(int n) {
        result = new ArrayList<>();
        dfs("(", 1, 0, n);
        return result;
    }

    public void dfs(String current, int open, int closed, int target){
        if(open+closed==target*2){
            result.add(current);
            return;
        }
        if(open < target){
            dfs(current + "(", open+1, closed, target);
        }
        if(open > closed){
            dfs(current + ")", open, closed+1, target);
        }
    }
}