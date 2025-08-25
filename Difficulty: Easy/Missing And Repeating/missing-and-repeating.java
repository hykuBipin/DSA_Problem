class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        int n=arr.length;
        ArrayList<Integer> list =new ArrayList<>();
        
        int xor=0;
        for(int i=0;i<n;i++)
        {
            xor=xor ^ arr[i];
            xor=xor ^ (i+1);
        }
        
        int number = (xor & ~(xor-1));
        
        int zero=0;
        int one=0;
        for(int i=0;i<n;i++)
        {
            if((arr[i] & number) != 0)
            {
                one = one ^ arr[i];
            } else
            {
                zero = zero ^ arr[i];
            }
        }
        
        for(int i=1;i<=n;i++)
        {
            if((i & number) != 0)
            {
                one = one ^ i;
            } else
            {
                zero = zero ^ i;
            }
        }
        
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==one)
            {
                count++;
            }
        }
        
        if(count==2) 
        {
            list.add(one);
            list.add(zero);
        }else
        {
            list.add(zero);
            list.add(one);
        }
        
        return list;
        
    }
}
