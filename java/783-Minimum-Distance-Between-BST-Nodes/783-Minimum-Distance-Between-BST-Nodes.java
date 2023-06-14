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
    List<Integer> l;
    public int minDiffInBST(TreeNode root) {
        l = new ArrayList<>();
        getAllValues(root);
        int[] iArr = new int[l.size()];
        for(int i = 0; i < l.size(); i++){
            iArr[i] = l.get(i);
        }
        Arrays.sort(iArr);
        int min = Integer.MAX_VALUE;
        for(int i = 1; i < iArr.length; i++){
            min = Math.min(min, iArr[i]-iArr[i-1]);
        }
        return min;
    }
    public void getAllValues(TreeNode current){
        if(current == null)
            return;
        l.add(current.val);
        getAllValues(current.left);
        getAllValues(current.right);
    }
}