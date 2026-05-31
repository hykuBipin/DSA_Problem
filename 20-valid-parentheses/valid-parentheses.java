class Solution {
    public boolean isValid(String s) {
        if(s==null || s.length() <= 0) return true;
        int n=s.length();
        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray())
        {
           if(ch=='(' || ch=='[' || ch=='{')
           {
               stack.push(ch);
           }else 
           {
              if(stack.isEmpty()) return false;
               char top = stack.pop();
               if((ch == ')' && top != '(') ||
                   (ch== ']' && top != '[') ||
                   (ch== '}' && top != '{'))
                   {
                      return false;
                   }
           }
        }
        return stack.isEmpty();
    }
}