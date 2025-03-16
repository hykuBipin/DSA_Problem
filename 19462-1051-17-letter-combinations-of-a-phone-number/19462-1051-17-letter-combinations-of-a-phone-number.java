class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty())return Collections.emptyList();

        String[] phone_map={"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> output =new ArrayList<>();
        backtrack("",digits,phone_map,output);
        return output;
    }

    private void backtrack(String combinations, String nextdigits,String[] phone_map, List<String> output)
    {
        if(nextdigits.isEmpty())
        {
            output.add(combinations);
        }else
        {
            String letters= phone_map[nextdigits.charAt(0)-'2'];
            for(char letter: letters.toCharArray())
            {
                backtrack(combinations+letter,nextdigits.substring(1),phone_map,output);
            }
        }
    }
}