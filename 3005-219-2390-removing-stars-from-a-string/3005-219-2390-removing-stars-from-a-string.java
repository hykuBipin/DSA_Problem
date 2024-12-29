class Solution {
    public String removeStars(String s) {
        Stack<Character>  stack=new Stack();

        for(char word:s.toCharArray())
        {
            if(word=='*')
            {
                stack.pop();
            }else
            {
                stack.add(word);
            }
        }
        StringBuilder sb =new StringBuilder();
        for(char result:stack)
        {
            sb.append(result);
        }
        return sb.toString();
    }
}