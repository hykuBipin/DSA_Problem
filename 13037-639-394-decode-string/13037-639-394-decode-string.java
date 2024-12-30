class Solution {
    public String decodeString(String s) {
        Stack<Integer> stack=new Stack();
        Stack<StringBuilder> stackstr=new Stack();
        StringBuilder sb = new StringBuilder();
        int n=0;
        for(char str: s.toCharArray())
        {
            if(Character.isDigit(str))
            {
                n=n*10+(str-'0');
            }else if(str=='[')
            {
                stack.push(n);
                n=0;
                stackstr.push(sb);
                sb=new StringBuilder();
            } else if(str==']')
            {
                int k=stack.pop();
                StringBuilder temp=sb;
                sb=stackstr.pop();
                while(k-- > 0)
                {
                    sb.append(temp);
                }
            } else
            {
                sb.append(str);
            }
        }
        return sb.toString();
    }
}