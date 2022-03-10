package G4G.LinkedList;
// https://practice.geeksforgeeks.org/problems/reverse-a-linked-list/1
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

