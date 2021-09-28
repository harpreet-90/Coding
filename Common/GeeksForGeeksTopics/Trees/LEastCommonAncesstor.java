package Trees;

import java.util.*;

public class LEastCommonAncesstor {

    // LCA in BST
    TreeNode LCA(TreeNode root, int n1, int n2)
    {
        if(root == null) return null;

        if(root.data == n1 ||root.data == n2){
            return root;
        }

        if(root.data <= n1 && root.data < n2){
            return LCA(root.right,n1,n2);
        }
        else if(root.data > n1 && root.data > n2){
            return LCA(root.left,n1,n2);
        }
        else{
            return root;
        }
    } 

    // LCA in Binary Tree

    TreeNode LCAInBinaryTree(TreeNode root, int n1, int n2)
    {
        if(root == null) return null;

        ArrayList<TreeNode> arr = new ArrayList<>();

        arr.addAll(preparePathOfNode1(root, n1));
        if(arr.size() == 0) return null;
        return findParentByComparingN1Path(root, arr, n2, root);
    }

    private TreeNode findParentByComparingN1Path(TreeNode root,ArrayList<TreeNode> arr, int n2, TreeNode last) {
        if(root == null) return null;
        if(arr.size()==0) return null;

        if(root.data == n2) return last;

        if(arr.contains(root)){
            TreeNode left =  findParentByComparingN1Path(root.left,arr,n2,root);
            if(left != null) return left;
            return findParentByComparingN1Path(root.right,arr,n2,root);
        }
        
        return (checkNodeExist(root,n2))? last: null;
    }

    private boolean checkNodeExist(TreeNode root, int n) {
        if(root == null) return false;
        if(root.data == n) return true;
        return checkNodeExist(root.left,n) || checkNodeExist(root.right,n);
    }

    private ArrayList<TreeNode> preparePathOfNode1(TreeNode root, int n) {
        ArrayList<TreeNode> arr = new ArrayList<>();

        if(root == null) return null;
       
        if(root.data == n){
            arr.add(root);
            return arr;
        }
        ArrayList<TreeNode> left = preparePathOfNode1(root.left, n);
        ArrayList<TreeNode> right = preparePathOfNode1(root.right,n);

        if(left.size() != 0){
            arr.addAll(left);
            arr.add(root);
            return arr;
        }
        else{
            arr.addAll(right);
            arr.add(root);
            return arr;
        }
    }

}
