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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null || n<=0) return new ListNode(0);

         ListNode dummy = new ListNode(0);
         ListNode slow = dummy;
         ListNode fast = dummy;
         dummy.next = head;

         //find n+1 steps from slow to locate nth node
         for(int i=0;i<=n;i++)
         {
             fast = fast.next;
         }

         //now move both slow and fast
         while(fast!=null)
         {
            fast = fast.next;
            slow = slow.next;
         }
     
        slow.next = slow.next.next;
        return dummy.next;
    }
}

// Complexity	Value
// TC	O(n)
// SC	O(1)