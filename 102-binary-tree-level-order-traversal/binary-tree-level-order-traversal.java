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
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null) return new ArrayList<>();

        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty())
        {
           int size=queue.size();
           List<Integer> level =  new ArrayList<>();

           for(int i=0;i<size;i++)
           {
              TreeNode current = queue.poll();
              level.add(current.val);
              if(current.left!=null)  queue.offer(current.left);
              if(current.right!=null) queue.offer(current.right);
           }
           result.add(level);
        }
       return result;
    }
}

// Time & Space Complexity
// If fixed, the algorithm would be:

// Time: O(n) — each node is visited once
// Space: O(n) — the queue can hold up to a full level of nodes
// This is optimal for level order traversal.