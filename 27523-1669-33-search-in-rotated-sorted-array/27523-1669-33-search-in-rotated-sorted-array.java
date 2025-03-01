class Solution {
    public int search(int[] nums, int target) {
        int N=nums.length;
        int start=0,end=N-1;
        if(N==0) return -1;

        while(start <= end)
        {
            int mid=(start + end)/2;
            if(nums[mid]==target)
            {
                return mid;
            }
            else if(nums[mid] >= nums[start])
            {
                if ((nums[mid] > target) && (nums[start] <= target) )
                  {
                    end=mid-1;
                  } else
                  {
                    start=mid+1;
                  } 
            }else
            {
                if ((nums[mid] < target) && (nums[end] >= target) )
                  {
                     start=mid+1;
                  } else
                  {
                     end=mid-1;
                  } 
            }
        }
        return -1;
    }
}