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
    int count=0;
    int result=-1;
    public int kthSmallest(TreeNode root, int k) {
        if(root==null || k<=0) return -1;
        inorder(root,k);
        return result;
    }

    private void inorder(TreeNode root, int k)
    {
        if(root==null) return;

        inorder(root.left,k);

        count++;

        if(count==k)
        {
            result = root.val;
            return;
        }

        inorder(root.right,k);
    }
}

// Time: O(N) worst case
// Space: O(H), where H is the height of the tree (O(log N) for balanced, O(N) for skewed)