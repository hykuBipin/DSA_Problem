class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int N=nums1.length;
        int M=nums2.length;
        int start=0,end=N;
        if(N>M) return findMedianSortedArrays(nums2,nums1);
        int firsthalfcount=(N+M+1)/2;

        while(start <= end)
        {
            int mid=(start+end)/2;
            int first=mid;
            int second=firsthalfcount - mid;
            int l1 = (first == 0) ? Integer.MIN_VALUE : nums1[first - 1];
            int l2 = (second == 0) ? Integer.MIN_VALUE : (second - 1 >= 0 ? nums2[second - 1] : Integer.MIN_VALUE);
            int r1 = (first == N) ? Integer.MAX_VALUE : nums1[first];
            int r2 = (second == M) ? Integer.MAX_VALUE : (second < M ? nums2[second] : Integer.MAX_VALUE);
            if(Math.max(l1,l2) <= Math.min(r1,r2))
            {
                if((N+M)%2==1)
                {
                   return ((double) Math.max(l1,l2));
                }else
                {
                   return (Math.max(l1,l2) + Math.min(r1,r2))/2.0;
                }
            }else if(l2 > r1)
            {
                start=mid + 1;
            }else
            {
                end=mid-1;
            } 
        }
        return -1.0;
    }
}