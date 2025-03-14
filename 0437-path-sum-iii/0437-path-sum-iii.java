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
    int total=0;
    public int pathSum(TreeNode root, int targetSum) {
        if(root == null) return 0;
        helper(root, targetSum, 0);
        pathSum(root.left, targetSum);
        pathSum(root.right, targetSum);
        return total;
    }

    void helper(TreeNode root, int targetSum, long currsum) {
        if(root == null) return;
        currsum += root.val;
        if(currsum == targetSum) total++;
        helper(root.left, targetSum, currsum);
        helper(root.right, targetSum, currsum);
    }
}