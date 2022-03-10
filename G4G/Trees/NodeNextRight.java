package G4G.Trees;

public class NodeNextRight{
    int data;
    public NodeNextRight left;
    public NodeNextRight right;
    public NodeNextRight nextRight;
    public NodeNextRight(int data){
        this.data = data;
        left=null;
        right=null;
        nextRight = null;
    }
}