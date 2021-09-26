package LinkedList;
class ReverseList {
    Node reverseList(Node head)
    {
        Node newHead = null;

        while(head!=null)
        {
            Node temp = newHead;
            newHead = head;
            head = head.next;
            newHead.next = temp;
        }
        return newHead;
    }

   
}

