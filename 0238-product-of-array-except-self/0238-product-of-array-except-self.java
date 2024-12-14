class Solution {
    public int[] productExceptSelf(int[] nums) {
        int N=nums.length;
        int[] result= new int[N];
        
        Arrays.fill(result,1);
        int currentL=1;
        for(int i=0; i < N ; i++)
        {
            result[i] *=  currentL;
            currentL *= nums[i];
        }
        
        int currentR=1;
        for(int j=N-1; j >= 0 ; j--)
        {
            result[j] *=  currentR;
            currentR *= nums[j];
        }
        
        return result;
        
        
    }
}