class Solution {
    // Please change the array in-place
    public void insertionSort(int arr[]) {
        if(arr==null || arr.length==0)
        {
            throw new IllegalArgumentException("Array should not be empty or null");
        }
        
        int n=arr.length;
        for(int i=0 ; i<= n-1; i++)
        {
            int j=i;
            while(j > 0 && arr[j] < arr[j-1])
            {
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
        
    }
}