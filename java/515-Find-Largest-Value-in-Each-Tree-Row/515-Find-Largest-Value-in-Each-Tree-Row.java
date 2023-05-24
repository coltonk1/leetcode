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
    public List<Integer> largestValues(TreeNode root) {
       List<Integer> result = new ArrayList<>();
        
        List<Integer> arr = new ArrayList<>();
        
        List<TreeNode> level = new ArrayList<>();
        
        if(root == null) return arr;
        
        arr.add(root.val);
        if(root.left != null)
        level.add(root.left);
        if(root.right != null)
        level.add(root.right);
        
        while(true){
            List<TreeNode> nextLevel = new ArrayList<>();
            if(level.size() == 0) break;
            int max = level.get(0).val;
            for(TreeNode current : level){
                if(current.val > max) max = current.val;
                if(current.left != null) nextLevel.add(current.left);
                if(current.right != null) nextLevel.add(current.right);
            }
            arr.add(max);
            level = nextLevel;
            if(level.size() == 0){
                break;
            }
        }
        
        return arr;
    }
}