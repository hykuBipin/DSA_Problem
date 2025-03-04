class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int N=temperatures.length;
        Stack<Integer> stack =new Stack<>();
        int[] result = new int[N];
     
     for(int i=N-1;i>=0;i--)
    {
            while (!stack.isEmpty() && temperatures[stack.peek()] <= temperatures[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                result[i] = 0; 
            } else {
                result[i] = stack.peek()-i; 
            }
            stack.push(i);
     } 
        return result; 
    }
}