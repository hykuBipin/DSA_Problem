class Solution {
    static void rotateArr(int arr[], int d) {
        int n=arr.length;
        if(arr==null ||n <= 0) return;
         d = d % n;
        
          swap(arr,0,d-1);
          swap(arr,d,n-1);
          swap(arr,0,n-1);
    }
    
    public static void swap(int[] arr, int start, int end)
    {
        while(start < end)
        {
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}