class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] result = new int[n];

        if(nums==null || n==0) return new int[] {-1,-1};

        for(int i=0;i<n;i++)
        {
           int complement = target - nums[i];
           if(map.containsKey(complement))
           {
              return new int[] {map.get(complement),i}; 
           }
            map.put(nums[i],i);
        }
        return result;
    }
}