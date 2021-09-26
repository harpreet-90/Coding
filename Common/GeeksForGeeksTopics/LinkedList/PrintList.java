package LinkedList;

public class PrintList {
    public void print(Node head){
        while(head!=null){
            System.out.print(head.value + "->");
            head = head.next;
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
