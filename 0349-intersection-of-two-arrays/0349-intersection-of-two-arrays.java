class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;

        if(m==0 || n==0) return new int[]{-1};
        Set<Integer> set =new HashSet<>();
        Set<Integer> resultset =new HashSet<>();
        for(int a: nums1)
        {
                set.add(a);
        }

        for(int b:nums2)
        {
           if(set.contains(b))
           {
             resultset.add(b);
           }
        }

        int[] result =new int[resultset.size()];
        int i=0;
        for(int num: resultset)
        {
           result[i++]=num;
        }
       return result;
    }
}