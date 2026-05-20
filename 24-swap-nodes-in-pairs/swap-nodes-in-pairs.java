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
    public ListNode swapPairs(ListNode head) {
        //Iterative process
        if(head==null ||head.next==null) return head;
        
        ListNode dummy = new ListNode(0);
        dummy.next=head;
        ListNode prev = dummy;

        while(prev.next!=null && prev.next.next!=null)
        {
            ListNode first = prev.next;
            ListNode second = first.next;
            ListNode nextpair = second.next;

            second.next = first;
            first.next = nextpair;
            prev.next=second;

            prev = first;
        }
     return dummy.next;
    }
}

    // //Recursive Approach
    //  // Base case
    //   if(head==null || head.next==null) return head;

    //   ListNode first = head;
    //   ListNode second = first.next;

    //   first.next = swapPairs(second.next);
    //   second.next = first;
    //   return second;
    // }
// }

// Iterative Approach Time & Space Complexity
// Time: O(n) — each node is visited a constant number of times.
// Space: O(1) — no extra data structures are used.

//Recursive Aproach
// Time & Space Complexity
// Time: O(n) — each node is visited once.
// Space: O(n) due to the recursion call stack.