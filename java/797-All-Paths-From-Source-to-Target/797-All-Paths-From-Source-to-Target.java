class Solution {
    List<List<Integer>> result = new ArrayList<>();
    int[][] graph_;
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        graph_ = graph;
        int n = graph.length-1;
        List<Integer> currentList = new ArrayList<>();
        recursive(0, n, currentList);
        return result;
    }

    public void recursive(int i, int target, List<Integer> currentList){
        if(i == target){
            currentList.add(i);
            result.add(new ArrayList(currentList));
            currentList.remove(currentList.size()-1);
            return;
        }

        for(int a = 0; a < graph_[i].length; a++){
            currentList.add(i);
            recursive(graph_[i][a], target, currentList);
            currentList.remove(currentList.size()-1);
        }
        return;
    }
}