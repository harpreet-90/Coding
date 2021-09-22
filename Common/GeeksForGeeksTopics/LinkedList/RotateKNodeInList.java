package LinkedList;

public class RotateKNodeInList {

    // write code using modular approach
    public static Node reverse(Node node, int k)
    {
        Node head = null;
        Node newHead = node;
        Node last = node;
        Node temp;
        Node lastToLast = null;
        while(node!=null){
            newHead = node;
            last = node;
            node = node.next;
            for(int i=1; i<k && node!=null; i++){
                temp = newHead;
                newHead = node;
                last.next = node.next;
                newHead.next = temp;
                node = last.next;
            }
            if(head == null){
                head = newHead;
                lastToLast = last;
            }
            else{
                lastToLast.next = newHead;
                lastToLast = last;
            }
        }
        return head;
    }


}
