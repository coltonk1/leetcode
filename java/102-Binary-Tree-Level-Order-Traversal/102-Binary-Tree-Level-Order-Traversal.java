/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        generate(result, root, 0);
        return result;
    }
    public void generate(List<List<Integer>> result, TreeNode current, int i){
        if(current == null) return;
        if(result.size() <= i)
            result.add(new ArrayList<>());
        result.get(i).add(current.val);
        generate(result, current.left, i+1);
        generate(result, current.right, i+1);
    }
}