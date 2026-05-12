class Solution {
    public int maxArea(int[] height) {
       if(height==null || height.length <= 0) return -1;
       int n=height.length;
       int left=0,right=n-1;
       int currentArea=0,maxArea=0;
       while(left < right)
       {
          int minHeight = Math.min(height[left],height[right]);
          int width = right - left;
          currentArea = minHeight * width;
          if(height[left] < height[right])
          {
             left++;
          }else
          {
             right--;
          }
          maxArea = Math.max(maxArea,currentArea);
       }
        return maxArea;
    }
}

// The time complexity is O(n), where n is the number of elements in the array, which is optimal for this problem. The space complexity is O(1), since only a fixed number of variables are used regardless of input size.