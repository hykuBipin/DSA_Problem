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
    public ListNode rotateRight(ListNode head, int k) {
            if(head==null || head.next==null || k==0) return head;

            //find tail and its length to rotate (make it circular list)
            ListNode tail=head;
            int length=1;
            while(tail!=null && tail.next!=null)
            {
                tail = tail.next;
                length++;
            }
            tail.next = head;

            //Handle outbound condition
            k = k % length;
            int steps = length - k;

            //Move tail to new tail with number of steps identified and also rest head according after tail
            ListNode newtail = head;
            for(int i=1;i<steps;i++)
            {
                newtail = newtail.next;
            }
           
           //break the circle
           ListNode newhead = newtail.next;
           newtail.next = null;

           return newhead;
    }
}