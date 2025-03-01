class Solution {
    public int singleNonDuplicate(int[] nums) {
        int N=nums.length;
        int start=0,end=N-1;
        int ans=0;
        if(N==0) return -1;
        if(N==1) return nums[0]; 
        if(nums[0]!=nums[1]) return nums[0];
        if(nums[N-1]!=nums[N-2]) return nums[N-1];

        while(start <=end )
        {
           int mid=(start+ end)/2; 
           if(nums[mid]==nums[mid+1])
           {
             mid++;
           }

           if(mid%2==1)
           {
              start=mid+1;
           } else
           {
              ans=mid;
              end=mid-1; 
           }

        }
        return nums[ans];
    }
}