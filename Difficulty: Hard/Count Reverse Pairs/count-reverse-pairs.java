class Solution {
    public int countRevPairs(int[] arr) {
       int n=arr.length;
        return mergesort(arr,0,n-1);
    }
    
    public static int mergesort(int arr[], int low, int high)
    {
        int count=0;
        if(low >= high) return count;
        int mid = (low + high) / 2;
        count += mergesort(arr,low,mid);
        count += mergesort(arr,mid+1,high);
        count += countpairs(arr,low,mid,high);
        merge(arr,low,mid,high);
        return count;
    }
    
    public static int countpairs(int arr[], int low, int mid, int high)
    {
        int count=0;
        int right=mid+1;
        for(int i=low; i <= mid; i++)
        {
            while(right <= high && arr[i] > 2* arr[right])
            {
                right++; 
            }
                count+=(right -(mid+1));

        }
        return count;
    }
    
    public static void merge(int arr[], int low, int mid, int high)
    {
        ArrayList<Integer> list= new ArrayList<>();
        int cnt=0;
        int left=low;
        int right=mid+1;
        
        while(left <= mid && right <= high)
        {
            if(arr[left] <= arr[right])
            {
                list.add(arr[left]);
                left++;
            }else
            {
                list.add(arr[right]);
                right++;
                cnt += (mid-left+1);
            }
        }
        
        while(left <= mid)
        {
            list.add(arr[left]);
            left++;          
        }
        
        while(right <= high)
        {
            list.add(arr[right]);
            right++;          
        }
        
        for(int i=low;i<=high;i++)
        {
            arr[i] = list.get(i-low);
        }
    }
}