class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        int N=s.length();
        StringBuilder sb =new StringBuilder();
        if(N==0) return "";
        
        for(char ch: s.toCharArray())
        {
            if(stack.isEmpty())
            {
                stack.push(ch);
            }else
            {
                if(stack.peek() == ch)
                {
                    stack.pop();
                }else
                {
                    stack.push(ch);
                }
            }
        }

        while(!stack.isEmpty())
        {
            sb.append(stack.pop());
        }

        return sb.reverse().toString();
    }
}