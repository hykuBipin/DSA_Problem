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
      int maxsum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        if(root==null) return 0;
        dfs(root);
        return maxsum;
    }

    private int dfs(TreeNode root)
    {
       if(root==null) return 0;

       int left = Math.max(0,dfs(root.left));
       int right = Math.max(0,dfs(root.right));

       int currsum = left + right + root.val;
       maxsum = Math.max(currsum,maxsum);

       return root.val + Math.max(left,right);
    }
}

// Time & Space Complexity
// Time: O(n) — each node is visited once.
// Space: O(h) recursion stack, where h is the tree height.
// This is optimal for this problem.