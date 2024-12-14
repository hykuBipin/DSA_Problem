class Solution {
    public int[] productExceptSelf(int[] nums) {
       int N = nums.length;
       int[] ans = new int[N];

        ans[0] = 1; 
        for (int i = 1; i < N; i++) {
            ans[i] = ans[i - 1] * nums[i - 1];
            System.out.println(ans[i] + " "+ ans[i-1]+ " " + nums[i]+ " "+ nums[i-1]);
        }

        int rightProduct = 1;
        for (int i = N - 1; i >= 0; i--) {
            ans[i] *= rightProduct;
             System.out.println(ans[i] + " " + rightProduct);
            rightProduct *= nums[i]; 
             System.out.println(nums[i] + " " + rightProduct);
        }

        return ans;
    }
}