class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        int n=arr.length;
        if(arr==null || n==0)
        {
          throw new IllegalArgumentException("Array should not be null");
        }
        int max=arr[n-1];
        ArrayList<Integer> result=new ArrayList<>();
        result.add(arr[n-1]);
        
        int pos=0;
        for(int i=n-2;i>=0;i--)
        {
            if(arr[i] >= max)
            {
                result.add(arr[i]);
                max=arr[i];
            }
        }
        Collections.reverse(result);
        return result;
    }
}
