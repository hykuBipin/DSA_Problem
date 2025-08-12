class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m==0 && n==0)
        {
            throw new IllegalArgumentException("Array should not be null or empty");
        }

     int total=m+n;
     int gap= (total+1)/2;

     while(gap>0)
     {
        int i = 0, j=gap;

        while(j<total) 
        {
            int a = (i < m) ? nums1[i] : nums2[i-m];
            int b=  (j<m) ? nums1[j] : nums2[j-m];

            if(a>b)
            {
                if(i<m && j<m)
                {
                    int temp=nums1[i];
                    nums1[i]=nums1[j];
                    nums1[j]=temp;
                }else if(i <m && j>= m)
                {
                    int temp=nums1[i];
                    nums1[i]=nums2[j-m];
                    nums2[j-m]=temp;
                }else
                {
                    int temp=nums2[i-m];
                    nums2[i-m]=nums2[j-m];
                    nums2[j-m]=temp;
                }
            }
            i++;j++;
        }

        gap = (gap==1) ? 0 : (gap+1)/2;
     }
      
      for(int i=0;i<n;i++)
      {
         nums1[m+i]=nums2[i];
      }
    }
}