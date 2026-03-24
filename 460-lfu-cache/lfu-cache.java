class LFUCache {

    class Node{
        int key;
        int value;
        Node prev;
        Node next;
        int freq;

        public Node(int key,int value)
        {
            this.key=key;
            this.value=value;
            this.freq=1;
        }
    }

    class DoublyLinkedList {
        Node leftdummy;
        Node rightdummy;
        int size;

        public DoublyLinkedList()
        {
            leftdummy = new Node(0,0);
            rightdummy = new Node(0,0);

            leftdummy.next=rightdummy;
            rightdummy.prev=leftdummy;
            size=0;
        }

        public void removeNode(Node nodetodelete)
        {
            Node leftneighbour = nodetodelete.prev;
            Node rightneighbour = nodetodelete.next;

            leftneighbour.next = rightneighbour;
            rightneighbour.prev = leftneighbour;
            size--;

        }

        public void insertAtMRU(Node newNode)
        {
            Node leftneighbour = rightdummy.prev;
            leftneighbour.next=newNode;
            newNode.prev=leftneighbour;

            newNode.next = rightdummy;
            rightdummy.prev = newNode;
        
            size++;
        }

        public Node removenodeAtLRU()
        {
            if(size==0) return null;
            Node leastNode = leftdummy.next;
            removeNode(leastNode);
            return leastNode;
        }
    }
    private int capacity;
    private int minfrequency;
    private HashMap<Integer,Node> keymap;
    private HashMap<Integer,DoublyLinkedList> freqmap;

    public LFUCache(int capacity) {
        this.capacity = capacity;
        keymap = new HashMap<>();
        freqmap =new HashMap<>();
        minfrequency=0;   
    }
    
    public int get(int key) {
        if(!keymap.containsKey(key))
        {
            return -1;
        }

        Node existingNode = keymap.get(key);
        updatefrequency(existingNode);
        return existingNode.value;
    }
    
    public void put(int key, int value) {
        if (capacity == 0) return;

        //if existing key founds
        if(keymap.containsKey(key))
        {
            Node existingNode = keymap.get(key);
            existingNode.value = value;
            updatefrequency(existingNode);
            return;
        }

        //if capacity is full need to delete empty freqlist DLL in LRU Mode
        if(keymap.size()==capacity)
        {
           DoublyLinkedList freqlist = freqmap.get(minfrequency);
           Node nodetodelete = freqlist.removenodeAtLRU();
           keymap.remove(nodetodelete.key);
        }

        //Insert NewNode
        Node newNode = new Node(key,value);
        keymap.put(key,newNode);
        minfrequency=1;

        DoublyLinkedList list = freqmap.getOrDefault(1,new DoublyLinkedList());
        list.insertAtMRU(newNode);
        freqmap.put(1,list);
    }

    public void updatefrequency(Node node)
    {
        int oldfrequency = node.freq;
        DoublyLinkedList oldlist = freqmap.get(oldfrequency);
        oldlist.removeNode(node);

        if(oldfrequency==minfrequency && oldlist.size==0)
        {
            minfrequency++;
        }
        node.freq++;

        DoublyLinkedList list = freqmap.getOrDefault(node.freq,new DoublyLinkedList());
        list.insertAtMRU(node);
        freqmap.put(node.freq,list);
    }
}

/**
 * Your LFUCache object will be instantiated and called as such:
 * LFUCache obj = new LFUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */