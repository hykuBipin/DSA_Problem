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
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null) return true;
         
         //Find Mid
         ListNode slow = head;
         ListNode fast = head;
         while(fast!=null && fast.next!=null)
         {
            slow=slow.next;
            fast=fast.next.next;
         }

         //find mid and reverse from Mid
         ListNode secondhead = reverse(slow);

         //compare vals of head and secondhead
         ListNode p1 =  head;
         ListNode p2 =  secondhead;
         while(p2!=null)
         {
            if(p1.val != p2.val)
            {
               return false;
            }
            p1=p1.next;
            p2=p2.next;
         }

        //restore list to original
        reverse(secondhead);

        return true;

    }

    public static ListNode reverse(ListNode head)
    {
        ListNode prev = null;
        ListNode current = head;
        while(current!=null)
        {
            ListNode next = current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        return prev;
    }
}