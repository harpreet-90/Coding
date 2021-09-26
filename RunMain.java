import LinkedList.*;

public class RunMain
{

    public static void main(String args[]){
        NodeWithchild head = new NodeWithchild(1);
        head.child = new NodeWithchild(-1);
       
        head.child.child = new NodeWithchild(-2);
        head.child.child.next = new NodeWithchild(-12);
        head.child.child.child = new NodeWithchild(-3);
        head.next = new NodeWithchild(2);
        head.prev = null;
        head.next.child = new NodeWithchild(-4);
        head.next.child.child = new NodeWithchild(-5);
        head.next.child.child.child = new NodeWithchild(-6);
        head.next.next = new NodeWithchild(3);
        head.next.next.next = new NodeWithchild(4);
        head.next.next.next.next = new NodeWithchild(5);
        // head.next.next.next.next.next = new Node(6);
        // head.next.next.next.next.next.next = new Node(7);
        // head.next.next.next.next.next.next.next = new Node(8);
        PrintList p = new PrintList();
        // p.print(head);
        // head = RotateKNodeInList.reverse(head, 4);
        // p.print(head);
        // NthNodeFromEnd n = new NthNodeFromEnd();
        // System.out.println(n.getNthFromLast(head, 5));
        FlattenList fl = new FlattenList();
        p.print(fl.flatten(head));

        

    }
}
