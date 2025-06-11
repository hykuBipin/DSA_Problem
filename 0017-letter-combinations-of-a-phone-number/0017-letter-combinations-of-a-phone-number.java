class Solution {
    public static final String[] KEYPAD = {
        "",  //0
        "",  //1
        "abc",  //2
        "def",  //3
        "ghi",  //4
        "jkl",  //5
        "mno",  //6
        "pqrs",  //7
        "tuv",  //8
        "wxyz"  //9
    };

    public List<String> letterCombinations(String digits) {
        List<String> result =new ArrayList<>();
        if(digits==null || digits.length()==0) return result;
        backtrack(digits,0,new StringBuilder(),result);
        return result;
    }

    public void backtrack(String digits, int index, StringBuilder current, List<String> result)
    {
        if(index==digits.length())
        {
            result.add(current.toString());
            return;
        }

        String letters = KEYPAD[digits.charAt(index) - '0'];
        for(char ch: letters.toCharArray())
        {
            current.append(ch);
            backtrack(digits, index+1, current, result);
            current.deleteCharAt(current.length()-1);
        }
    }
}