class Solution {
    class TrieNode{
            TrieNode[] children = new TrieNode[26];
            String isWord;
    }
    public List<String> findWords(char[][] board, String[] words) {
        if(board==null || board.length==0 || board[0].length==0 || words==null) return new ArrayList<>();

        int n=board.length;
        int m= board[0].length;
        List<String> result =new ArrayList<>();

        TrieNode root = buildTrie(words);
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                dfs(board,i,j,root,result);
            }
        }

        return result;
    }

    private TrieNode buildTrie(String[] words)
    {
       TrieNode root = new TrieNode();

       for(String word: words)
       {
          TrieNode current = root;

         for(char ch: word.toCharArray())
         {
            int index = ch - 'a';
            if(current.children[index]==null)
            {
                current.children[index] = new TrieNode();
            }
            current = current.children[index];
         }
         current.isWord = word;
       }
       return root;
    }

    private void dfs(char[][] board, int row, int col, TrieNode current, List<String> result)
    {
        if(row < 0 || col <0 || row >= board.length || col >= board[0].length) return;
        char ch=board[row][col];
        if(ch=='#') return;

        TrieNode next = current.children[ch-'a'];

        if(next==null)
        {
            return;
        }

        if(next.isWord!=null)
        {
            result.add(next.isWord);
            next.isWord = null;      //initialise
        }

        board[row][col]='#';        //mark as visited

        //DFS navigation
        dfs(board,row+1,col,next,result);
        dfs(board,row-1,col,next,result);
        dfs(board,row,col+1,next,result);
        dfs(board,row,col-1,next,result);

        board[row][col]=ch; //reassigning original character
    }
}

// Time & Space Complexity
// The intended approach is good: Trie + backtracking.

// Expected time: roughly O(m * n * 4^L) in worst-case search, but much better in practice with trie pruning.
// Trie build: O(sum of word lengths).
// Space: O(sum of word lengths) for the trie, plus recursion depth O(L).
// However, because the implementation is broken, complexity analysis is only theoretical.