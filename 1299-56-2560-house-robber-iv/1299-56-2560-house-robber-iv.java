class Solution {
    public int minCapability(int[] nums, int k) {
        int N=nums.length;
        int minval=Integer.MAX_VALUE,maxval=Integer.MIN_VALUE;
        for(int i=0;i<N;i++)
        {
            minval = Math.min(minval,nums[i]);
            maxval = Math.max(maxval,nums[i]);
        }
        int start=minval,end=maxval,result=0;
        while(start <= end)
        {
            int mid=start+(end-start)/2;
            if(helper(nums,k,mid))
            {
                result=mid;
                end=mid-1;
            }else
            {
                start=mid+1;
            }
        }
        return result;
    }

    static boolean helper(int[] nums,int k,int target)
    {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] <= target)
            {
                count++;
                i++;
            }
        }
        return count>=k;
    }
}