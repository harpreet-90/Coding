package LinkedList;

import java.util.*;

public class DetectLoopInList {
    public boolean detectLoop(Node head){
        Hashtable<Node, Boolean> ht = new Hashtable<>();
        while(head!=null){
            if(ht.containsKey(head)){
                return true;
            }
            else{
                ht.put(head, true);
            }
            head = head.next;
        }
        return false;
    }
}
