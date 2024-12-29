class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> rad=new LinkedList<>(),dir=new LinkedList<>();
        int N=senate.length();
        for(int i=0;i<N;i++)
        {
            if(senate.charAt(i)=='R')
            {
                rad.add(i);
            }else{
                dir.add(i);
            }
        }

        while(!rad.isEmpty() && !dir.isEmpty())
        {
            if(rad.peek() < dir.peek())
            {
                rad.add(N++);
            }else{
                dir.add(N++);
            }
            rad.poll();
            dir.poll();
        }

        return (rad.isEmpty()) ? ("Dire") : ("Radiant");
    }
}