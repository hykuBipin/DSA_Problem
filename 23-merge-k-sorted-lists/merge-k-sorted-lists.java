/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b) -> a.val - b.val);

       //constrcuting priority queue of k nodes
       for(ListNode node: lists)
       {
             if(node != null)
             {
                pq.offer(node);
             }
       }

       ListNode dummy = new ListNode(0);
       ListNode current = dummy;
       while(!pq.isEmpty())
       {
         ListNode minnode =pq.poll();
         current.next = minnode;
         current = current.next;
         
          if(minnode.next!=null)
          {
             pq.offer(minnode.next);
          }
       }
       return dummy.next;
    }
}