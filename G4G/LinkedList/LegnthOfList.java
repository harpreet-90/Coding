package G4G.LinkedList;

public class LegnthOfList {
    public  static int find(Node head){
        if(head == null) return 0;
        int count = 0;
        while(head!=null){
            count++;
            head = head.next;
        }
        return count;
    }
}
