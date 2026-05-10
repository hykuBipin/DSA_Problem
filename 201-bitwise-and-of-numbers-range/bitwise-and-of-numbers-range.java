class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        if(left<0 || right<0) return -1;
        if(left==right) return right;

        while(right > left)
        {
            right = right & (right-1);
        }
        return right;
    }
}

// Time Complexity: Worst case O(log right) because each iteration clears the lowest set bit of right. This is efficient for the problem constraints.
// Space Complexity: O(1), which is optimal.