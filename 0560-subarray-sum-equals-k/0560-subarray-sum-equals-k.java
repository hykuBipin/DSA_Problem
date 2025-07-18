class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0, 1);
        
        int currsum=0,count=0,complement=0;
        for(int i=0; i <n; i++)
        {
           currsum += nums[i];
           complement=currsum-k;
           if(map.containsKey(complement))
           {
             count+=map.get(complement);
           }
           map.put(currsum,map.getOrDefault(currsum,0)+1);
        }
        return count;
    }
}