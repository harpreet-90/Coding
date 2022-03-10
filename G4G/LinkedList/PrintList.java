package G4G.LinkedList;

public class PrintList {
    public void print(Node head){
        if(head == null) System.out.print("null");
        Node node = head;
        System.out.print(node.value + "->");
        node = head.next;
        while(node!=null && head!=node){
            System.out.print(node.value + "->");
            node = node.next;
        }
        System.out.println("null");
    }
    public void print(NodeWithchild head){
        while(head!=null){
            String prev = "" + ((head.prev!=null)?head.prev.data:"null");
            System.out.print("(n="+ head.data + "prev="+ prev + ")->");
            head = head.next;
        }
        System.out.println("null");
    }
}
