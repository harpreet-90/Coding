// https://practice.geeksforgeeks.org/problems/min-distance-between-two-given-nodes-of-a-binary-tree/1

package G4G.Trees;

public class DistanceBetweenTwoNodes {
    int findDist(TreeNode root, int a, int b) {
        int distance = 0;
        LeastCommonAncesstor lca = new LeastCommonAncesstor();
        TreeNode lcaNode = lca.LCAInBT(root, a, b);
        distance += distanceFromRootToNode(root, a);
        distance += distanceFromRootToNode(root, b);
        distance -= 2 * distanceFromRootToNode(root, lcaNode.data);
        return distance;
    }
    private int distanceFromRootToNode(TreeNode root, int val) {
        if(root == null) return -1;
        if(root.data == val) return 1;
        int distance  = Math.max(distanceFromRootToNode(root.left,val),distanceFromRootToNode(root.right,val));
        return distance + ((distance!=-1)?1:0);
    } 
}
