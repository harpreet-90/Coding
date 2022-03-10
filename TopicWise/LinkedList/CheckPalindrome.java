package TopicWise.LinkedList;
// https://practice.geeksforgeeks.org/problems/check-if-linked-list-is-pallindrome/1#
public class CheckPalindrome {
    public boolean isPalindrome(Node head) 
    {
        if(head == null || head.next==null) return true;
        Node slow, fast, prev = null;
        slow = fast = head;
        ReverseList r = new ReverseList();
        while(slow != null && fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;
        Node reverseHead = r.reverseList(slow);

        while(reverseHead!= null && head!=null)
        {
            if(head.value != reverseHead.value) return false;
            head = head.next;
            reverseHead = reverseHead.next;
        }

        return true;
    }
}
