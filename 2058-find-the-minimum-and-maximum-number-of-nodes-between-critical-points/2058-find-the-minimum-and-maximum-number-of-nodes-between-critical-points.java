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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if(head == null || head.next ==null)
        {
            return new int[]{-1,-1};
        }

        List<Integer> result=new ArrayList<>();
        int index=2;
        ListNode prev=head;
        ListNode current=head.next;
        ListNode next=current.next;

        while(next!=null)
        {
            if((prev.val < current.val && current.val > next.val) ||(prev.val > current.val && current.val < next.val))
            {
               result.add(index);
            }

            prev=current;
            current=next;
            next=next.next;
            index++;
        }

        if(result.size() < 2) return new int[]{-1,-1};
        int minDist = Integer.MAX_VALUE;

        for(int i=1; i < result.size(); i++)
        {
            minDist=Math.min(minDist, result.get(i) - result.get(i-1));
        }
       
       int maxDist=result.get(result.size()-1) - result.get(0);

       return new int[]{minDist,maxDist};
    }
}