class Solution {
    public int largestAltitude(int[] gain) {
        int N=gain.length;
        int curraltitude=0;
        int result=0;
        
        for(int i=0;i< N; i++)
        {
            curraltitude += gain[i];
            result = Math.max(result, curraltitude);
        }
        return result;
    }
}