import LinkedList.*;

public class RunMain
{

    public static void main(String args[]){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        // head.next.next.next.next.next = new Node(6);
        // head.next.next.next.next.next.next = new Node(7);
        // head.next.next.next.next.next.next.next = new Node(8);
        PrintList p = new PrintList();
        p.print(head);
        // head = RotateKNodeInList.reverse(head, 4);
        // p.print(head);

        NthNodeFromEnd n = new NthNodeFromEnd();
        System.out.println(n.getNthFromLast(head, 5));

    }
}
