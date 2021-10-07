
import Trees.*;

public class RunMain
{

    public static void main(String args[]){

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);
        root.right.left.right.left = new TreeNode(7);
        int target=4;
        int k=2;
        System.out.println(KDistanceNodes.KDistanceNodes1(root, target, k));

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
