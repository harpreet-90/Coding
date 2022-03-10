package TopicWise.LinkedList;

public class NthNodeFromEnd {

   public int getNthFromLast(Node head, int n)
   {
    Node slow = head;
    Node fast = head;

    int i = 0;
    for(i=1; i<n && fast!=null; i++){
        fast = fast.next;
    }
    if(fast == null) return -1;
    while(slow!=null && fast!=null && fast.next!=null){
        slow = slow.next;
        fast = fast.next;
    }

    return (slow!=null && i==n)?slow.value:-1;
}
    
}
