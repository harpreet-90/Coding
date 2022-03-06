package LinkedList;
// https://practice.geeksforgeeks.org/problems/sorted-insert-for-circular-linked-list/1#
// asked in 1st round of microsoft's interview(first time)
public class InsertInSortedCircularLinkedList {
    public static Node sortedInsert(Node head,int data)
    {
        Node newNode = new Node(data);
        if(head == null){
            newNode.next = newNode;
            return newNode;
        }

        
        Node prev = head, current = head.next;
        if(head.value >= data){
            while(current!=head){
                prev = current;
                current = current.next;
            }
            prev.next = insertBeforeNode(head, newNode);
            return newNode;
        }
        while(current!=head)
        {
            if(current.value >= data){
                prev.next = insertBeforeNode(current, newNode);
                return head;
            }
            prev = current;
            current = current.next;
        }
        if(current == head){
                //if data is greater/smaller than whole list elements. will isert before head
                prev.next = insertBeforeNode(head, newNode);
                if(head.value > data){
                    head = newNode;
                }
        }
        return head;
    }

    static Node insertBeforeNode(Node node, Node newNode)
    {
        newNode.next = node;
        return newNode;
    }
}
