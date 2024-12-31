class Solution {
    public int numTilings(int n) {
        long[] full_tilling =new long[n+1];
        long[] part_tilling =new long[n+1];
        int mod=1_000_000_007;
        if(n<=2)  return n;

        full_tilling[1]=1;
        full_tilling[2]=2;

        part_tilling[1]=0;
        part_tilling[2]=1;

       for(int i=3; i <= n; i++){

            full_tilling[i] = (full_tilling[i-1] + full_tilling[i-2] + 2 * part_tilling[i-1]) % mod;

            part_tilling[i] = (part_tilling[i-1] + full_tilling[i-2]) % mod;

        }        

        return (int)(full_tilling[n]);
    }
}