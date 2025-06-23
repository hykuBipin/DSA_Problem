class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n=nums.length;
        Map<Integer,Integer> map =new HashMap<>();
        for(int num: nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }

        PriorityQueue<Map.Entry<Integer,Integer>> MaxHeap = new PriorityQueue <> ((a,b) -> (a.getValue() - b.getValue()));
        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
           MaxHeap.add(entry);
           if(MaxHeap.size() > k)
           {
             MaxHeap.poll();
           }
        }

        int[] result =new int[k];
        int i=0;
        while(!MaxHeap.isEmpty())
        {
            result[i++] = MaxHeap.poll().getKey();
        }
        for(int left=0, right = k-1; left < right; left++,right--)
        {
            int temp = result[left];
            result[left] =result[right];
            result[right] =temp;
        }
        return result;
    }
}