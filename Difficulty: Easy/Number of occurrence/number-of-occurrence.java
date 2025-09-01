class Solution {
    int countFreq(int[] arr, int target) {
       int n=arr.length;
       if(n==0||arr==null)
       {
           throw new IllegalArgumentException("Array is Null");
       }
 
        int first = findFirst(arr, target);
        int last = findLast(arr, target);

        if (first == -1 || last == -1 || arr[first] != target || arr[last] != target) {
            return 0;
        }
        
        return (last-first+1);
    }

    public int findFirst(int[] nums, int target)
    {
        int n=nums.length;
        int low=0;
        int high=n-1;
        int ans=-1;
         while(low <= high)
        {
            int mid=low + (high -low)/2;
            if(nums[mid] >= target)
            {
                 ans=mid;
                 high=mid-1;
            }else
            {
                 low=mid+1;
            }
        }
        return ans;
    }

    public int findLast(int[] nums, int target)
    {
        int n=nums.length;
        int low = 0;
        int high = n - 1;
        int ans=-1;
        while(low <= high)
        {
            int mid=low + (high -low)/2;
            if(nums[mid] <= target)
            {
                 ans=mid;
                 low=mid+1;
            }else
            {
                 high=mid-1;
            }
        }
        return ans;
    }
}
