package LinkedList;

public class PrintList {
    public void print(Node head){
        while(head!=null){
            System.out.print(head.value + "->");
            head = head.next;
        }
        System.out.println("null");
    }
}
