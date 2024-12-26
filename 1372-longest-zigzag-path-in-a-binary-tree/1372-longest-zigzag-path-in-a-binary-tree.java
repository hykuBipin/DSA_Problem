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
    int  maxlength=0;
    public int longestZigZag(TreeNode root) {
        if(root==null) return 0;
        helper(root,0,0);
        helper(root,1,0);
        return maxlength;
    }
    
    private void helper(TreeNode root, int direction, int currlength)
    {
        if(root==null) return;
        maxlength=Math.max(maxlength,currlength);
        if(direction==1)
        {
            helper(root.left,0,currlength+1);
            helper(root.right,1,1);
        }else
        {                                                         helper(root.right,1,currlength+1);
            helper(root.left,0,1);
        }
    }
}