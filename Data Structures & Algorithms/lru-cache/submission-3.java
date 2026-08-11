
public class Node{
    int val;
    int key;
    Node next;
    Node prev;

    public Node(int key, int val){
        this.key = key;
        this.val = val;
        this.next = next;
        this.prev = prev;
    }

    public int getKey(){
        return this.key;
    }

    public int getValue(){
        return this.val;
    }
}

public class LRUCache {

    HashMap<Integer, Node> map = new HashMap<>();
    int cap;
    Node left;
    Node right;

    public LRUCache(int capacity) {
        this.cap = capacity;
        this.map = new HashMap<>();
        this.left = new Node(0, 0);
        this.right = new Node(0, 0);
        this.left.next = this.right;
        this.right.prev = this.left;
        
    }

    public void remove(Node node){
        Node tempNodeLeft = node.prev;
        Node tempNodeRight = node.next;
        tempNodeLeft.next = tempNodeRight;
        tempNodeRight.prev = tempNodeLeft;
    }
    
    public void insert(Node node){
        Node temp = this.right.prev;
        temp.next = node;
        node.prev = temp;
        node.next = this.right;
        this.right.prev = node;
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            Node node = map.get(key);
            remove(node);
            insert(node);

            return node.val;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            remove(map.get(key));
        }
        Node node = new Node(key, value);
        insert(node);
        map.put(key, node);

        if(map.size() > this.cap){
            node = this.left.next;
            remove(node);
            map.remove(node.getKey());
        }
    }
}
