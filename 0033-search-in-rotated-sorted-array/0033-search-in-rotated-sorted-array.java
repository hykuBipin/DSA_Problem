class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int ans=-1;
        if(nums==null || n==0)
        {
            throw new IllegalArgumentException("Array is null");
        }

        int low=0;
        int high=n-1;
        while(low <= high)
        {
            int mid=low + (high-low)/2;
            if(nums[mid]==target)
            {
                ans=mid;
                return mid;
            }

            if(nums[low] <= nums[mid])
            {
               if(nums[low] <= target && target <= nums[mid])
               {
                   high=mid-1;
               }else
               {
                   low=mid+1;
               }
            } else
            {
               if(nums[mid] <= target && target <= nums[high])
               {
                    low=mid+1;
               }else
               {
                   high=mid-1;
               }
            }
        }
        return ans;
    }
}