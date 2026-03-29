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
    public void reorderList(ListNode head) {
        //Find mid to split
        ListNode slow=head;
        ListNode fast=head;

        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }

        //Split into two list
        ListNode secondpart=slow.next;
        slow.next=null;

        //reverse the second list
        ListNode prev=null;
        ListNode current=secondpart;

        while(current!=null)
        {
           ListNode next = current.next;
           current.next=prev;
           prev=current;
           current=next;
        }
        secondpart = prev;


        //merge two list
        ListNode first = head;
        ListNode second=secondpart;

        while(second!=null)
        {
            ListNode temp1 = first.next;
            ListNode temp2 = second.next;

            first.next=second;
            second.next=temp1;

            first=temp1;
            second=temp2;
        }

    }
}