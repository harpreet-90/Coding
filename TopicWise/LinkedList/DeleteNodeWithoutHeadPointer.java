package TopicWise.LinkedList;
// https://practice.geeksforgeeks.org/problems/delete-without-head-pointer/1
public class DeleteNodeWithoutHeadPointer {
    void deleteNode(Node del)
    {
        if(del == null) return;
        // assuming given node is not tail node.
         Node temp = del.next.next;
         del.data = del.next.data;
         del.next = temp;
    }
}
