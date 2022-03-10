package TopicWise.LinkedList;

public class RotateList {
    public Node rotate(Node head, int k) {
        Node rotate = head;
        Node last = head;
        
        for(int i=1; i<k; i++){
            rotate = rotate.next;
        }

        while(last!=null && last.next!=null){
            last = last.next;
        }

        last.next = head;
        head = rotate.next;
        rotate.next = null;
        return head;
    }
}
