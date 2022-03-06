package LinkedList;
// https://leetcode.com/problems/copy-list-with-random-pointer/submissions/
public class CloneListWithRandomPointers {
    public Node copyRandomList(Node head) {
        Node newHead = copyListWithRandom(head);
        mergeListAlternatively(head, newHead);
        updateRandomPointers(head);
        NodesPair p = recreateNewList1(head);
        head = p.tail;
        return p.head;

    }
    // recreate bothe cloned and original lists.
    private NodesPair recreateNewList1(Node head) {
        Node newHead = head.next;
        Node current1, current2;
        Node trav1, trav2;
        current1 = head;
        trav1 = current1.next.next;
        current2 = head.next;
        trav2 = current2.next.next;
        while(trav1!=null && trav2!=null){
            Node temp1, temp2;
            temp1 = (trav1.next != null)? trav1.next.next: null;
            temp2 = (trav2.next != null)? trav2.next.next: null;
            
            current1.next = trav1;
            current2.next = trav2;
            
            current1 = current1.next;
            current2 = current2.next;

            trav1 = temp1;
            trav2 = temp2;

        }
        NodesPair p = new NodesPair(newHead, head);

        return p;
    }
    // it will distort original list and recreate only new list
    // private Node recreateNewList2(Node head) {
    //     Node newHead = head.next;
    //     Node current = head.next;
    //     Node trav = current.next.next;
    //     while(trav!=null){
    //         current.next = trav;
    //         current = current.next;
    //         trav = trav.next.next;
    //     }

    //     return newHead;
    // }

    private void updateRandomPointers(Node head) {
        Node current = head.next;
        while(current != null && current.next != null){
            current.random = (current.random != null)? current.random.next: null;
            current = current.next.next;
        }
    }

    private Node copyListWithRandom(Node head) {
        if(head == null) return null;
        Node newNode = new Node(head.value);
        newNode.random = head.random;
        newNode.next = copyListWithRandom(head.next);
        return newNode;
    }

    private void mergeListAlternatively(Node head, Node newHead) {
        Node temp = head.next;
        Node tempNew = newHead.next;
        while(head != null && newHead != null)
        {
            temp = head.next;
            tempNew = newHead.next;
            head.next = newHead;
            newHead.next = temp;
            head = temp;
            newHead = tempNew;
        }
    }
}
