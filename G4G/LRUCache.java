package G4G;

import java.util.*;
import TopicWise.LinkedList.Node;

public class LRUCache
{

    static HashMap<Integer, Node> hash = new HashMap<>();
    static HashMap<Node, Integer> hash2 = new HashMap<>();
    static Deque<Node> dq  = new LinkedList<>();
    static int capacity = 0;

    //Constructor for initializing the cache capacity with the given value.
    LRUCache(int cap)
    {
        capacity = cap;
    }

    //Function to return value corresponding to the key.
    public static int get(int key)
    {
        if(hash.containsKey(key)){
            dq.remove(hash.get(key));
            dq.addFirst(hash.get(key));
            return hash.get(key).value;
        }
        
        return -1;
    }

    //Function for storing key-value pair.
    public static void set(int key, int value)
    {
        
        if(hash.containsKey(key)){
            hash.get(key).value = value;
        }
        else{
            Node node = new Node(value);
            if(dq.size() < capacity){
                hash.put(key, node);
                hash2.put(node, key);
                dq.addFirst(node);
            }
            else{
                removeLeastRecentlyUSed();
                hash.put(key,node);
                hash2.put(node,key);
                dq.addFirst(node);
            }
        }
        
    }

    private static void removeLeastRecentlyUSed() {
        Node node = dq.pollLast();
        hash.remove(hash2.get(node));
        hash2.remove(node);
    }
}