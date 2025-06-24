/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 //Celonis question
//if p and q < r → go left
//if p and q > r → go right
//if p < r < q or p > r > q → r is lowest common ancestor
//r is root(parent)

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null) return null;
        
        while(root!=null)
        {
            if(p.val > root.val && q.val > root.val)
            {
                root = root.right;
            }else if (p.val < root.val && q.val < root.val)
            {
                root = root.left;
            }else
            {
                return root;
            }
        }
     return null;
    }
}