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
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        int a = next(root.left, 1);
        int b = next(root.right, 1);
        int result = 1;
        if(a > b) result = a;
        else return result = b;
        return result;
    }
    public int next(TreeNode current, int depth){
        if(current == null) return depth;
        int a = next(current.left, depth+1);
        int b = next(current.right, depth+1);
        if(a > b) return a;
        else return b;
    }
}