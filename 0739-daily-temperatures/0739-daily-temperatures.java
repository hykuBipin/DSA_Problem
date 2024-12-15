class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int N=temperatures.length;
        int[] result=new int[N];
        Stack<Integer> stack=new Stack<>();
        
        for(int i=0;i <N;i++)
        {
            while(!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]){
                result[stack.peek()] = i -stack.pop();
            }
          stack.push(i);
        }
         return  result;                                          
    }
}