class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int l=0;int r=arr.length-1;int mid=0;
        while(l < r)
        {
            mid = ( l + r) /2;
            if(arr[mid] < arr[mid +1])
            {
                l = mid + 1;
            }else{
                r=mid;
            }
        }
        return l;
    }
}