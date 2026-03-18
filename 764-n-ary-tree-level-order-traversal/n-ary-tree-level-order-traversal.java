/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> levelOrder(Node root) {
        if(root==null) return result;
        Queue<Node> queue = new LinkedList<>();

        queue.offer(root);
        while(!queue.isEmpty())
        {
            List<Integer> temp = new ArrayList<>();
            int size = queue.size();

            for(int i=0 ; i<size;i++)
            {
                Node current = queue.poll();
                temp.add(current.val);

                if(current.children != null)
                {
                    for(Node child: current.children)
                    {
                      queue.offer(child);
                    }
                }
            }
            result.add(temp);
        }
        return result;
    }
}