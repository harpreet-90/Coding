package G4G.LinkedList;
// https://practice.geeksforgeeks.org/problems/add-two-numbers-represented-by-linked-lists/1#
public class AddTwoNumbers {
    static Node addTwoLists(Node first, Node second){
        Node result = null;
        if(first == null) return second;
        if(second == null) return first;
        ReverseList r = new ReverseList();
        first = r.reverseList(first);
        second = r.reverseList(second);
        int carry = 0;
        Node trav1 = first;
        Node trav2 = second;
        
        int data = 0;
        while(trav1 != null && trav2 != null)
        {
            data = trav1.value + trav2.value + carry;
            carry = (data!=0)? (int)Math.floor(data/10): 0;
            data = data % 10;
            result = addBefore(result, data);
            trav1 = trav1.next;
            trav2 = trav2.next;
        }

        while(trav1 != null){
            data = carry + trav1.value;
            carry = (data!=0)? (int)Math.floor(data/10): 0;
            data = data % 10;
            result = addBefore(result, data);
            trav1 = trav1.next;
        }
        while(trav2 != null){
            data = carry + trav2.value;
            carry = (data!=0)? (int)Math.floor(data/10): 0;
            data = data % 10;
            result = addBefore(result, data);
            trav2 = trav2.next;
        }
        if(carry>0)
        {
            result = addBefore(result, carry);
        }
        return result;
    }

    static Node addBefore(Node node, int number)
    {
        Node n = new Node(number);
        if(node == null) return n;
        n.next = node;
        return n;
    }
}
