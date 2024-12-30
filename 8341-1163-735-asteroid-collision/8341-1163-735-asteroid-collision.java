class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack =new Stack<>();
        int N=asteroids.length;
        for(int nums: asteroids)
        {
            if(nums > 0)
            {
                stack.push(nums);
            }else
            {
                while(!stack.isEmpty() && stack.peek() > 0 &&  stack.peek() < -nums)
                {
                    stack.pop();
                }

                if(stack.isEmpty()  || stack.peek() < 0 )
                {
                    stack.push(nums);
                }

                if(stack.peek()==-nums)
                {
                    stack.pop();
                }

            }
        }

        int[] result = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }
        return result;
    }
}