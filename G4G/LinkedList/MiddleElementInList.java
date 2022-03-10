package G4G.LinkedList;

public class MiddleElementInList {
    int getMiddle(Node head)
    {
        if(head==null) return -1;

        if(head.next == null) return head.value;

        Node slow = head;
        Node fast = head;

        while(slow!=null && fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.value;
    }
}