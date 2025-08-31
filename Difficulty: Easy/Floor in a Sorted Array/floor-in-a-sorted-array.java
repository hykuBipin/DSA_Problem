class Solution {
    public int findFloor(int[] arr, int x) {
       int n=arr.length;
       if(n==0 || arr==null)
       {
           throw new IllegalArgumentException("Array is null");
       }
       
       int low=0;
       int high=n-1;
       int ans=-1;
       
       while(low <= high)
       {
           int mid=low + (high-low)/2;
           if(arr[mid]<=x)
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
