class LRUCache {
    class Node
    {
        int key;
        int value;
        Node prev;
        Node next;

        public Node(int key,int value)
        {
             this.key = key;
             this.value=value;
        }
    }

    private int capacity;
    private HashMap<Integer,Node> map;
    private Node leftdummy;
    private Node rightdummy;
    
    public LRUCache(int capacity) {
        this.capacity=capacity;
        map=new HashMap<>();
        leftdummy = new Node(0,0);
        rightdummy = new Node(0,0);

        leftdummy.next=rightdummy;
        rightdummy.prev=leftdummy;
    }

    public void remove(Node nodetodelete)
    {
       Node leftneighbour = nodetodelete.prev;
       Node rightneighbour = nodetodelete.next;

       leftneighbour.next  = rightneighbour;
       rightneighbour.prev = leftneighbour;
    }

    public void insertAtMRU(Node newNode)
    {
         Node leftneighbour = rightdummy.prev;
         newNode.prev = leftneighbour;
         leftneighbour.next=newNode;

         newNode.next=rightdummy;
         rightdummy.prev=newNode;
    }
    
    public int get(int key) {
        if(!map.containsKey(key))
        {
            return -1;
        }

        Node oldNode = map.get(key);
        remove(oldNode);
        insertAtMRU(oldNode);

        return oldNode.value;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key))
        {
            remove(map.get(key));
        }

        Node newNode = new Node(key,value);
        map.put(key,newNode);
        insertAtMRU(newNode);

        //capacity validation
        if(map.size() > capacity)
        {
           Node leastused = leftdummy.next;
           remove(leastused);
           map.remove(leastused.key);
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */