package LinkedList;
// https://leetcode.com/problems/swap-nodes-in-pairs/submissions/
// https://leetcode.com/problems/reverse-nodes-in-k-group/submissions/
public class RotateKNodeInList {

    // write code using modular approach
    public static Node reverse(Node node, int k)
    {
        Node head = null;
        Node newHead = node;
        Node last = node;
        Node temp;
        Node lastToLast = null;
        while(node!=null){
            newHead = node;
            last = node;
            node = node.next;
            for(int i=1; i<k && node!=null; i++){
                temp = newHead;
                newHead = node;
                last.next = node.next;
                newHead.next = temp;
                node = last.next;
            }
            if(head == null){
                head = newHead;
                lastToLast = last;
            }
            else{
                lastToLast.next = newHead;
                lastToLast = last;
            }
        }
        return head;
    }

//  modular approach
public static Node reverseKGroupModular(Node node, int k)
    {
        if(node == null) return node;
        if(k<=0) return node;
        Node current, listHead, prevGroupsLast;
        current = listHead = prevGroupsLast = null;
        current = node;
        while(current!=null){
            Node currentHead = current, currentLast = null;
            for(int i=k; i>0 && current != null; i--)
            {
                currentLast = current;
                current = current.next;
            }
            NodesPair pair = reverseListUtil(currentHead, currentLast);
            if(prevGroupsLast == null)
            {
                listHead = pair.head;
            }
            else
            {
                prevGroupsLast.next = pair.head;
            }
            prevGroupsLast = pair.tail;
        }
        

        return listHead;  
    }

    static NodesPair reverseListUtil(Node head, Node tail){
        
        Node last = head, current = head.next;
        while((head != tail) && (current != null))
        {
            Node temp = current.next;
            current.next = head;
            last.next = temp;
            head = current;
            current = current.next;
        }

        return new NodesPair(head, last);
    }
}
