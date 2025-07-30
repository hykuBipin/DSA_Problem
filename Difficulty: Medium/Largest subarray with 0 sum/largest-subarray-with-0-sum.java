class Solution {
    int maxLength(int arr[]) {
        int n=arr.length;
        if(arr==null || n==0)
        {
          throw new IllegalArgumentException("Array should not be Null or Empty");
        }
        
        HashMap<Integer,Integer> map=new HashMap<>();
        
        int maxi=0,sum=0;
        int start=-1,end=-1,prev=-1;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
            if(sum==0)
            {
              maxi=i+1;
              start=0;
              end=i;
            }else
            {
                if(map.containsKey(sum))
                {
                    maxi=Math.max(maxi,i-map.get(sum));
                    prev=map.get(sum);
                    start=i-prev;
                    end=i;
                }else
                {
                    map.put(sum,i);
                }
            }
        }
        
        return maxi;
    }
}