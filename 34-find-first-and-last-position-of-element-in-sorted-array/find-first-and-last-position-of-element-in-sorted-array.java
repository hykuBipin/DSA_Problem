class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums==null || nums.length <= 0) return new int[]{-1,-1};
        int first = firstOccurence(nums,target);
        if(first == -1)
        {
            return new int[]{-1,-1};
        }

        int last=lastOccurence(nums,target);
        return new int[]{first,last};
    }

    public int firstOccurence(int[] nums,int target)
    {
        int n=nums.length;
        int low=0,high=n-1;
        int ans=-1;

        while(low <= high)
        {
            int mid = low + (high-low)/2;
            if(target==nums[mid])
            {
                ans = mid;
                high=mid-1;
            }else if(target < nums[mid])
            {
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
       return ans;
    }

    public int lastOccurence(int[] nums,int target)
    {
        int n=nums.length;
        int low=0,high=n-1;
        int ans=-1;

        while(low <= high)
        {
            int mid = low + (high-low)/2;
            if(target==nums[mid])
            {
                ans = mid;
                low=mid+1;
            }else if(target < nums[mid])
            {
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
      return ans;
    }
}

// Time Complexity  : O(log n)
// Space Complexity : O(1)