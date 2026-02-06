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
    List<List<Integer>> answer =new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer> result = new ArrayList<>();
        solve(root,result,targetSum);
        return answer;
    }

    void solve(TreeNode root, List<Integer> result, int remaining)
    {
       if(root==null) return;

       result.add(root.val);
       
       if(root.left == null && root.right==null && remaining==root.val)
       {
          answer.add(new ArrayList<>(result));
       }else
       {
         solve(root.left,result, remaining-root.val);
         solve(root.right,result, remaining-root.val);
       }

       result.remove(result.size()-1);
    }
}