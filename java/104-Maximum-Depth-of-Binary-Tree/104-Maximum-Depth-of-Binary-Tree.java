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
        TreeDepth a = next(new TreeDepth(root.left, 1));
        TreeDepth b = next(new TreeDepth(root.right, 1));
        int result = 1;
        if(a.depth > b.depth) result = a.depth;
        else return result = b.depth;
        return result;
    }
    public TreeDepth next(TreeDepth d){
        if(d.node == null) return d;
        TreeDepth a = next(new TreeDepth(d.node.left, d.depth+1));
        TreeDepth b = next(new TreeDepth(d.node.right, d.depth+1));
        if(a.depth > b.depth) return a;
        else return b;
    }
}

class TreeDepth {
    TreeNode node;
    int depth;

    TreeDepth(TreeNode node, int depth){
        this.node = node;
        this.depth = depth;
    }
}