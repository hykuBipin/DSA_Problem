class MinStack {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minstack = new Stack<>();

    public MinStack() {
        stack=this.stack;
        minstack=this.minstack;
    }
    
    public void push(int val) {
        stack.push(val);
        if(minstack.isEmpty())
        {
           minstack.push(val);
        }else
        {
          int current= minstack.peek();
          minstack.push(Math.min(val,current));
        }

    }
    
    public void pop() {

        if(!stack.isEmpty())
        {
          stack.pop();
          minstack.pop();
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
         return minstack.peek();
    }
}
