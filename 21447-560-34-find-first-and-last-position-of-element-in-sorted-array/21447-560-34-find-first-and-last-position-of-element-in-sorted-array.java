class Solution {
    public int[] searchRange(int[] nums, int target) {
        int N=nums.length;
        int first=-1,last=-1;
        int start=0; int end=N-1;
        if(N==0) return new int[] {-1,-1};

        while(start <= end)
        {
            int mid=(start+end)/2;
            if(nums[mid]==target)
            {
                first=mid;
                end=mid-1;
            }else if(nums[mid] < target)
            {
                start=mid+1;
            }else if(nums[mid] > target)
            {
                end=mid-1;
            }
        }

        start=0;end=N-1;
        while(start <= end)
        {
            int mid=(start+end)/2;
            if(nums[mid]==target)
            {
                last=mid;
                start=mid+1;
            }else if(nums[mid] < target)
            {
                start=mid+1;
            }else
            {
                end=mid-1;
            }
        }
      return new int[]{first,last};
    }
}