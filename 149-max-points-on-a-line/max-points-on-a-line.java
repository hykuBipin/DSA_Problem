class Solution {
    public int maxPoints(int[][] points) {
        if(points==null) return 0;
        int n=points.length;
        int max=0;

        for(int i=0;i<n;i++)
        {
            HashMap<String,Integer> map = new HashMap<>();
            int duplicates=1;

          for(int j=i+1;j<n;j++)
          {
            int dx= points[j][0] - points[i][0];
            int dy= points[j][1] - points[i][1];

            if(dx==0 && dy==0)
            {
                duplicates++;
                continue;
            }

            int gcd = gcd(dx,dy);
            dx/=gcd;
            dy/=gcd;

            if(dx<0)
            {
                dx= -dx;
                dy= -dy;
            }
          
            String key = dx+"#"+dy;
            map.put(key,map.getOrDefault(key,0)+1);
          }

          int localmax=0;
          for(int val: map.values())
          {
             localmax = Math.max(localmax, val);
          }

          max = Math.max(max, localmax + duplicates);
        }
        return max;
    }

    public static int gcd(int a, int b)
    {
        if(b==0) return a;
        return gcd(b,a%b);
    }
}