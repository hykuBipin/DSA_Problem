class Solution {
    public int longestSubarray(int[] nums) {
        int N=nums.length;
        int left=0;
        int zero=0;
        int result=0;
        
        for(int right=0; right < N; right++)
        {
            if(nums[right] == 0)
            {
                zero++;
            }
            
            while(zero > 1)
            {
                if(nums[left]==0)
                {
                    zero--;
                }
                left++;
            }
            
            result = Math.max(result, right-left+1 - zero);
        }
        return (result == N) ? result-1 : result;
    }
}