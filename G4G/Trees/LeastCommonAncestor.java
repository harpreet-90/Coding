package G4G.Trees;

import java.util.*;

public class LeastCommonAncestor {
    public TreeNode LCA(TreeNode root, int n1, int n2)
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

    public TreeNode LCAInBT(TreeNode root, int a, int b){
        if(root==null) return null;
        ArrayList<TreeNode> pathA = path(root, a);
        ArrayList<TreeNode> pathB = path(root, b);
        // printList(pathA);
        // System.out.println();
        // printList(pathB);
        TreeNode lca = findLCA(pathA,pathB);
        return lca;
    }

    private TreeNode findLCA(ArrayList<TreeNode> pathA, ArrayList<TreeNode> pathB) {
        for(int i=0; i<pathA.size(); i++){
            if(pathB.contains(pathA.get(i))){
                return pathA.get(i);
            }
        }
        return null;
    }

    private ArrayList<TreeNode> path(TreeNode root, int a) {
        ArrayList<TreeNode> al = new ArrayList<>();
        if(root==null) return al;
        if(root.data == a)
        {
            al.add(root);
            return al;
        }
        al.addAll(path(root.left,a));
        al.addAll(path(root.right,a));
        if(al.size()>0) {
            al.add(root);
        }
        return al;
    }

    void printList(ArrayList<TreeNode> al){
        for(int i=0; i<al.size(); i++){
            al.get(i).print();
        }
        System.out.println();
    }
}
