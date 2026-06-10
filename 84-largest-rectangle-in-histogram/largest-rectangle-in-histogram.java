class Solution {
    public int largestRectangleArea(int[] heights) {
        if(heights==null || heights.length <=0 ) return 0;
        //Monotonic Stack

        int[] NSL = getSmallLeft(heights);
        int[] NSR = getSmallRight(heights);
        int ans=0;
        for(int i=0;i<heights.length;i++)
        {
            int height = heights[i];
            int width = NSR[i] - NSL[i] -1;
            ans = Math.max(ans, height * width);
        }
       return ans;
    }

    int[] getSmallLeft(int[] heights)
    {
        int n=heights.length;
        Stack<Integer> stack = new Stack<>();
        int[] result= new int[n];

        for(int i=0;i<n;i++)
        {
            while(!stack.isEmpty() && heights[stack.peek()] >= heights[i])
            {
                stack.pop();
            }

            if(stack.isEmpty())
            {
                result[i]=-1;
            }else
            {
                result[i]=stack.peek();
            }
            stack.push(i);
        }
        return result;
    }

    int[] getSmallRight(int[] heights)
    {
        int n=heights.length;
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[n];

        for(int i=n-1;i>=0;i--)
        {
            while(!stack.isEmpty() && heights[stack.peek()] >= heights[i])
            {
                stack.pop();
            }
            if(stack.isEmpty())
            {
                result[i]=n;
            }else{
                result[i] = stack.peek();
            }
            stack.push(i);
        }
        return result;
    }
}

// Time & Space Complexity
// Time: O(n)
// Each index is pushed and popped at most once in each stack pass.
// Space: O(n)
// For the two arrays and the stacks.