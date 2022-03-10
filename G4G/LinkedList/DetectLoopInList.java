package TopicWise.LinkedList;

import java.util.*;
// https://practice.geeksforgeeks.org/problems/detect-loop-in-linked-list/1
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

    public boolean detectLoopFast(Node head){
        Node slow, fast;
        slow = head;
        fast = head.next;
        while(slow != null && fast != null && fast.next != null){
            if(fast == slow){
                return true;
            }
            fast = fast.next.next;
            slow = slow.next;
        }
        return false;
    }
}
