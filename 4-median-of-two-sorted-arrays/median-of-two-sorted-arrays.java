class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length,n=nums2.length;

        if(nums1.length > nums2.length) return findMedianSortedArrays(nums2,nums1);

        int low=0,high=m;

        while(low <= high)
        {
           int partitionA = low + (high - low)/2;
           int partitionB = ((m+n+1)/2) - partitionA;

           int maxLeftA = (partitionA==0) ? Integer.MIN_VALUE : nums1[partitionA-1];
           int maxLeftB = (partitionB==0) ? Integer.MIN_VALUE : nums2[partitionB-1];

           int minRightA = (partitionA==m) ? Integer.MAX_VALUE : nums1[partitionA];
           int minRightB = (partitionB==n) ? Integer.MAX_VALUE : nums2[partitionB];

           if(maxLeftA <= minRightB && maxLeftB <= minRightA)
           {
              //odd
              if((m+n)%2 == 1)
              {
                  return Math.max(maxLeftA,maxLeftB);
              }else
              {
                //even
                  return (Math.max(maxLeftA,maxLeftB) + Math.min(minRightA,minRightB))/2.0;
              }

           } else if(maxLeftA > minRightB)
           {
               high = partitionA -1;
           }else{
               low =  partitionA +1;
           }
        }
       return 0.0;
    }
}

// Time & Space Complexity
// Time: O(log(min(m, n))), which is optimal and meets the required O(log(m+n)).
// Space: O(1)