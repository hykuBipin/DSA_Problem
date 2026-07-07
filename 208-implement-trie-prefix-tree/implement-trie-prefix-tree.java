class Trie {
    class TrieNode{
        TrieNode[] children;
        boolean isWord;
        public TrieNode()
        {
          children = new TrieNode[26];
          isWord = false;
        }
    }
   
    private TrieNode root;
    public Trie() {
        root = new TrieNode();
    }
    
    public void insert(String word) {
        TrieNode current = root;
        
        for(char ch : word.toCharArray())
        {
            int index = ch - 'a';

            if(current.children[index]==null)
            {
                current.children[index] = new TrieNode();
            }
            current = current.children[index];
        }
        current.isWord=true;
    }
    
    public boolean search(String word) {
        TrieNode current = root;

        for(char ch: word.toCharArray())
        {
            int index = ch -'a';

            if(current.children[index]==null)
            {
                return false;
            }
            current = current.children[index];
        }
        return current.isWord;
    }
    
    public boolean startsWith(String prefix) {
        TrieNode current = root;
         for(char ch: prefix.toCharArray())
         {
            int index = ch -'a';
            if(current.children[index]==null)
            {
                return false;
            }
            current = current.children[index];
         }
         return true;
    }
}

// Time & Space Complexity
// Insert: O(L)
// Search: O(L)
// startsWith: O(L)
// Where L is the length of the word/prefix.

// Space complexity is O(N * 26) in the worst case for the trie nodes, or more simply O(total characters inserted). This is optimal for a standard trie solution.

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */