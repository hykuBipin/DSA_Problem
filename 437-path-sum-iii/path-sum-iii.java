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
        if(root==null) return 0;
        HashMap<Long,Integer> prefix = new HashMap<>();
        prefix.put(0L,1);
        return dfs(root,0,targetSum,prefix);
    }

    private int dfs(TreeNode root,long currentSum, int targetSum, HashMap<Long,Integer> prefix)
    {
        if(root==null)
        {
            return 0;
        }

        currentSum += root.val;

        int count = prefix.getOrDefault(currentSum - targetSum,0);

        prefix.put(currentSum, prefix.getOrDefault(currentSum,0)+1);

        count += dfs(root.left,currentSum,targetSum,prefix);
        count += dfs(root.right,currentSum,targetSum,prefix);

        prefix.put(currentSum,prefix.get(currentSum)-1);

        return count;
    }
}

// Time & Space Complexity
// Time: O(n) — each node is visited once.
// Space: O(h) average recursion stack plus O(n) for the prefix map in the worst case. This is optimal for this problem.