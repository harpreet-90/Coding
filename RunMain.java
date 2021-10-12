
import LinkedList.CheckPalindrome;
import LinkedList.Node;
import LinkedList.PrintList;
// import Trees.*;

public class RunMain
{

    public static void main(String args[])
    {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(1);
        // head.next.next.next.next = new Node(3);
        // head.next.next.next.next.next = new Node(1);
        // head.next.next.next.next.next.next = head;
        PrintList p = new PrintList();
        p.print(head);
        CheckPalindrome cp = new CheckPalindrome();
        System.out.println(cp.isPalindrome(head));
        
        // head = InsertInSortedCircularLinkedList.sortedInsert(head, 6);
        // p.print(head);
        // head = InsertInSortedCircularLinkedList.sortedInsert(head, 6);
        // p.print(head);
        // head = InsertInSortedCircularLinkedList.sortedInsert(head, 8);
        // p.print(head);
        // head = InsertInSortedCircularLinkedList.sortedInsert(head, 0);
        // p.print(head);
        // TreeNode root = new TreeNode(1);
        // root.left = new TreeNode(2);
        // root.right = new TreeNode(3);
        // root.right.left = new TreeNode(4);
        // root.right.left.right = new TreeNode(5);
        // root.right.right = new TreeNode(6);
        // root.right.left.right.left = new TreeNode(7);
        // int target=4;
        // int k=2;
        // System.out.println(KDistanceNodes.KDistanceNodes1(root, target, k));

        // LeastCommonAncesstor l = new LeastCommonAncesstor();
        // l.LCAInBT(root, 6, 7).print();
        // int[][] grid = {{1,0,0},{1,1,0},{1,1,0}};
        // int[][] grid ={{2,1,1},{0,1,1},{1,0,1}};
        // int[][] grid = {{0,0,0},{1,1,0},{1,1,0}};
        // int[][] grid = {{0,1},{1,0}};
        // int[][] grid = {{0,1,1,1,1,1,1,1},{0,1,1,0,0,0,0,0},{0,1,0,1,1,1,1,0},{0,1,0,1,1,1,1,0},{0,1,1,0,0,1,1,0},{0,1,1,1,1,0,1,0},{0,0,0,0,0,1,1,0},{1,1,1,1,1,1,1,0}};
        // ShortestPathInBinaryMatrix ro = new ShortestPathInBinaryMatrix();
        // System.out.println(ro.shortestPathBinaryMatrix(grid));
    }
}
