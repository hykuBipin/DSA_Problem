class Solution {
    public int kthSmallest(int[] arr, int k) {
        int n=arr.length;
        if(arr==null || n <=0 ) return -1;
         PriorityQueue<Integer> pq =new PriorityQueue<>(Collections.reverseOrder());

         for(int i=0;i<n;i++)
         {
             if(pq.size() < k)
             {
                pq.add(arr[i]);
             }else if(arr[i] < pq.peek())
             {
                pq.poll();
                pq.add(arr[i]);
             }   
         }

       return pq.peek();
    } 
        
}
