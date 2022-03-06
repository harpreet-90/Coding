package G4G;

import java.util.ArrayList;
// Another way to solve : use Inorder travaersal and save the values in array.
// If array is sorted. It is corect BST else not.
public class IsBST {
    //Time complexity: O(N)
    // extra Space: O(1) or O(3)exact;
    public boolean isBST(TreeNode root){
        ArrayList<Integer> arr = IsBSTInternalFunc(root);
        return (arr.get(2)==1)? true: false;
    }
        // arr.get(0) is for min, arr.get(1) is max, arr.get(2) is true if subTree is correct BST
    private ArrayList<Integer> IsBSTInternalFunc(TreeNode root){
        if(root == null) return null;
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> left;
        ArrayList<Integer> right;
        if(root.left == null && root.right == null) {
            arr.add(root.data);
            arr.add(root.data);
            arr.add(1);
            return arr;
        } 
        else{
            left = IsBSTInternalFunc(root.left);
            right = IsBSTInternalFunc(root.right);
        }
        int leftResult = 0;
        int rightResult = 0;
        if(left == null){
            arr.add(root.data);
            leftResult = 1;
        }else{
            if(left!= null && (root.data >= root.left.data) && root.data>=left.get(1)){
                arr.add(left.get(1));
                leftResult = (left.get(2) == 0)?0:1;
            }
            else{
                arr.add(left.get(1));
                leftResult = 0;
            }
        }
        if(right == null){
            arr.add(root.data);
            rightResult = 1;
        }
        else{
            if(right!=null && (root.data < root.right.data) && root.data<=right.get(0)){
                arr.add(right.get(0));
                rightResult = (right.get(2) == 0)?0:1;
            }
            else{
                arr.add(right.get(0));
                rightResult = 0;
            }
        }
        leftResult = (leftResult == 1 && rightResult == 1)? 1: 0;
        arr.add(leftResult);
        return arr;
    }
}
