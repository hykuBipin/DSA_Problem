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
import java.util.*;
class Solution {
    public int maxLevelSum(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root==null) return 0;
        dfs(root,result,0);
        int maxval=0;
        for(int i=0;i < result.size();++i)
        {
            if(result.get(maxval) < result.get(i))
            {
                maxval=i;
            }
        }
        return maxval+1;
    }
    
    private void dfs(TreeNode curr,List<Integer> result,int currdepth)
    {
        if(curr==null)  return;
        if(currdepth==result.size())
        {
            result.add(curr.val);
        }else
        {
            result.set(currdepth, result.get(currdepth) +  curr.val);
        }
        
        dfs(curr.left,result,currdepth+1);
        dfs(curr.right,result,currdepth+1);    
    }
}