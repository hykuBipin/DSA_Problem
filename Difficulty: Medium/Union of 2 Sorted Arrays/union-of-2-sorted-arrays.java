// User function Template for Java

// a,b : the arrays
class Solution {
    // Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        int n=a.length;
        int m=b.length;
        ArrayList<Integer> list = new ArrayList<>();
        
        if(n==0)
        {
            for(int x: b)
            {
                list.add(x);
            }
            return list;
        }
        
        if(m==0)
        {
            for(int y: a)
            {
                list.add(y);
            }
            return list;
        }
        
        int i=0,j=0;
        while(i<n && j<m)
        {
            if(a[i] < b[j])
            {
              if(i== 0 || a[i]!=a[i-1])
               {
                list.add(a[i]);
               }
                i++;
             } else if(a[i] > b[j])
             {
                if(j==0 || b[j]!=b[j-1])
                {
                  list.add(b[j]);
                }
                j++;
              }else
             {
                if(i==0 || a[i]!=a[i-1]) 
                {
                    list.add(a[i]);
                }
                i++;
                j++;
              }  
            }
        
        while(i<n)
        {
          if(i==0 || a[i]!=a[i-1])
            {
                list.add(a[i]);
            }  
            i++;
        }
        
        while(j<m)
        {
          if(j==0 || b[j]!=b[j-1])
            {
                list.add(b[j]);
            }
            j++;
        }
           return list;
    }
}