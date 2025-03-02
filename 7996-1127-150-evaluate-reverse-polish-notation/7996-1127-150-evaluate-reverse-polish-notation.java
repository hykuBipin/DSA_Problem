class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack =new Stack<>();
        for(String token: tokens)
        {
            if(isoperator(token))
            {
               int b=stack.pop();
               int a=stack.pop();
               int result=performfunc(a,b,token);
               stack.push(result);
            }else
            {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }

    boolean isoperator(String token)
    {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/"); 
    }

    int performfunc(int a, int b, String token)
    {
        switch(token)
        {
            case "+":
              return a+b;
            case "-":
              return a-b;
            case "*":
              return a*b;
            case "/":
              return a/b;
              default:
                throw new IllegalArgumentException("Invalid operator: " + token);

        }
    }
}