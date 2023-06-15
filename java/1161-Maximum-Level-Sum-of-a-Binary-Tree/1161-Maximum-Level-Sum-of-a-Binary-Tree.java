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
    public int maxLevelSum(TreeNode root) {
        Map<Integer, Integer> hash = new HashMap<Integer, Integer>();
        add(root, 0, hash);
        int max = Integer.MIN_VALUE;
        int level = 0;
        for(Map.Entry<Integer, Integer> entry : hash.entrySet()){
            if(entry.getValue() > max){
                max = entry.getValue();
                level = entry.getKey();
            }
        }
        return level+1;
    }
    public void add(TreeNode current, int i, Map hash){
        if(current == null) return;
        hash.put(i, (int)hash.getOrDefault(i, 0)+current.val);
        add(current.left, i+1, hash);
        add(current.right, i+1, hash);
    }
}