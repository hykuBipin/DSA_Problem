class Solution {
    public int towerOfHanoi(int n, int from, int to, int aux) {
        if(n==0) return 0;
        int count=0;
        
        count+=towerOfHanoi(n-1,from,aux,to);
        count++;
        count+=towerOfHanoi(n-1,aux,to,from);
        
        return count;
        
    }
}
