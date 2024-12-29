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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer>  result = new ArrayList<>();
        rightview(root,result,0);
        return result;
    }

    private void rightview(TreeNode curr, List<Integer> result,int currdepth)
    {
        if(curr==null) return;
        if(currdepth==result.size())
        {
            result.add(curr.val);
        }
        rightview(curr.right,result,currdepth+1);
        rightview(curr.left,result,currdepth+1);
    }
}