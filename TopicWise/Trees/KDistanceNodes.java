package Trees;

import java.util.*;
class IntComparator implements Comparator<Integer>{
    @Override
    public int compare(Integer o1, Integer o2) {
        return o1 - o2;
    }
}
public class KDistanceNodes {
    public static ArrayList<Integer> al;
    public static Boolean isFound = false;

    public static ArrayList<Integer> KDistanceNodes1(TreeNode root, int target, int k) {
        al = new ArrayList<>();
        isFound = false;
        int subtract = 0;
        helperKDistance(root, target, k, subtract);
        al.sort(new IntComparator());
        return al;
    }

    private static int helperKDistance(TreeNode root, int target, Integer k, Integer subtract) {
        if (root == null)
            return 0;
        if (root.data == target) {
            kDistanceNodesDownward(root, k, 0);
            subtract = 1;
            return 1;
        } else {
            int leftFound = helperKDistance(root.left, target, k, subtract);
            int rightFound = helperKDistance(root.right, target, k, subtract);
            if (leftFound > 0) {
                subtract = leftFound;
                if(k-subtract == 0){
                    al.add(root.data);
                }
                else{
                    kDistanceNodesDownward((root.right), k - subtract, 1);
                }
            }
            else if (rightFound > 0) {
                subtract = rightFound;
                if(k-subtract == 0){
                    al.add(root.data);
                }
                else{
                    kDistanceNodesDownward((root.left), k - subtract, 1);
                }
                
            }

            
            return subtract + ((leftFound > 0 || rightFound > 0 )? 1: 0);
        }
    }

    private static void kDistanceNodesDownward(TreeNode root, int k, int current) {
        if (root == null)
            return;
        if (k == current) {
            al.add(root.data);
        } else {
            kDistanceNodesDownward(root.left, k, current + 1);
            kDistanceNodesDownward(root.right, k, current + 1);
        }
    }

}
