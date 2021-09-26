package LinkedList;

public class MergeTwoSortedList {
    public Node sortedMerge(Node head1, Node head2) {
        Node head = null;
        Node last = null;
        Node curr = null;
        while(head1!=null && head2!=null){
            if(head1.value<=head2.value){
                curr = head1;
                head1 = head1.next;
            }
            else{
                curr = head2;
                head2 = head2.next;
            }

            if(head==null) head = curr;
            if(last==null){
                last = curr;
            }
            else{
                last.next = curr;
                last = last.next;
            }
        }
        while(head1!=null){
            last.next = head1;
            head1 = head1.next;
            last = last.next;
        }
        while(head2!=null){
            last.next = head2;
            head2 = head2.next;
            last = last.next;
        }
        return head;

      } 
}
