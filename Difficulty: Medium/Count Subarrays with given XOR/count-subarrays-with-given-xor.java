class Solution {
    public long subarrayXor(int arr[], int k) {
        // X = XR^K logic (prefix xor concept)
        
        int n=arr.length;
        if(n == 0 || arr==null)
        {
          throw new IllegalArgumentException("Array Should not be Null");
        }
        
        int xr=0; long count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(xr,1);

        for(int i=0;i<n;i++)
        {
            xr = xr ^ arr[i];
            
            int x = xr ^ k;
            
            if(map.containsKey(x))
            {
                count+=map.get(x);
            }
            
            if(map.containsKey(xr))
            {
                map.put(xr,map.getOrDefault(xr,0)+1);
            }else
            {
                map.put(xr,1);
            }
        }
        return count;
    }
}