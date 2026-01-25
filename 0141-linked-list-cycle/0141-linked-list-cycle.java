/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null || head.next==null)
        {
            return false;
        }

        //Floyd's cycle algorithm
        ListNode slow=head;
        ListNode fast=head;
        boolean hasCycle=false;

        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast)
            {
                hasCycle=true;
                break;
            }
        }

        if(!hasCycle)
        {
            return false;
        }

        slow=head;
        while(slow!=fast)
        {
            slow=slow.next;
            fast=fast.next;
        }
        return true;
    }
}