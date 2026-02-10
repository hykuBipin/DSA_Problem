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
    public int minDepth(TreeNode root) {
        return height(root);
    }

    public static int height(TreeNode node)
    {
        if(node==null) return 0;
        int left=height(node.left);
        int right=height(node.right);

        if(node.left==null) return 1 + right;
        if(node.right==null) return 1 + left;
        return 1 + Math.min(left,right);
    }
}