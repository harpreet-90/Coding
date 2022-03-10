package G4G.LinkedList;

public class IntersectPoint {

    int intersectPoint(Node head1, Node head2){
        if(head1==null || head2==null) return -1;
        int len1 = LegnthOfList.find(head1);
        int len2 = LegnthOfList.find(head2);
        int diff;
        diff = len1-len2;
        if(len1<len2){
            Node temp = head1;
            head1 = head2;
            head2 = temp;
            diff = len2 - len1;
        }

        for(int i=1; i<=diff && head1!=null; i++){
            head1 = head1.next;
        }

        while(head1!=null && head2!=null){
            if(head1 == head2){
                return head1.value;
            }
            head1 = head1.next;
            head2 = head2.next;
        }
        
        return -1;
    }
    
}
