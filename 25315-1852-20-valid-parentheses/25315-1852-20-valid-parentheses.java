class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack =new Stack<>();
        int N=s.length();
        if(N==0) return false;

        for(char ch: s.toCharArray())
        {
            if(ch=='(' || ch=='[' || ch=='{')
            {
                stack.push(ch);
            }else if(ch==')' || ch==']' || ch=='}')
            {
                if(stack.isEmpty())
                {
                    return false;
                }
                char top =stack.pop();

                if(!matchingpair(top,ch))
                {
                    return false;
                }
            }
        }
        return stack.isEmpty() ? true:false;
    }

    boolean matchingpair(char opening, char closing)
    {
        return(opening=='(' && closing==')' ||
               opening=='[' && closing==']' ||
               opening=='{' && closing=='}'
        );
    }
}