class Solution {
    int upperBound(int[] arr, int target) {
       int n=arr.length;
       int low=0;
       int high=n-1;
       if(n==0 || arr==null)
       {
           throw new IllegalArgumentException("Array is null or empty");
       }
        int ans=n;
       
       while(low <= high)
       {
           int mid=low + (high-low)/2;
           if(arr[mid] > target)
           {
               //move left
               ans=mid;
               high=mid-1;
               
           }else
           {
               //move right
               low=mid+1;
           }
       }
       return ans;
    }
}
