class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n=nums.length;
        PriorityQueue<Integer> maxheap =new PriorityQueue<>();
        for(int i=0;i < k; i++)
        {
            maxheap.offer(nums[i]);
        }

        for(int j=k; j < n ; j++)
        {
            if(nums[j] > maxheap.peek())
            {
                maxheap.poll();
                maxheap.offer(nums[j]);
            }
        }
        return maxheap.peek();
    }
}