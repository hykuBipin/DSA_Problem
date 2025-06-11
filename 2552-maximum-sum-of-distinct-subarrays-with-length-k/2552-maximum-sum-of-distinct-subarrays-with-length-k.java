import java.util.HashMap;
class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map =new HashMap<>();
        long maxsum=0;
        long currsum=0;
        int left=0;

        for(int right=0; right< nums.length; right++)
        {
                map.put(nums[right], map.getOrDefault(nums[right],0)+1);
                currsum += nums[right];

            //edge case sliding window overflow
            if(right-left+1 > k)
            {
                map.put(nums[left], map.get(nums[left])-1);
                if(map.get(nums[left])==0)
                {
                    map.remove(nums[left]);
                }
                currsum -= nums[left];
                left++;
            }

            //match case
            if(right-left+1 == k && map.size() == k)
            {
                maxsum = Math.max(maxsum,currsum);
            }
        }
       return maxsum;
    }
}