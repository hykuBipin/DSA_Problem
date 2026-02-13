class Solution {
    long count=0L;
    public long distributeCandies(int n, int limit) {
       return f(n) - 3*f(n-(limit+1)) + 3*f(n-2*(limit+1)) - f(n-3*(limit+1));
    }

    public long f(long x)
    {
       return x < 0 ? 0 : (x+2)*(x+1)/2;
    }
}