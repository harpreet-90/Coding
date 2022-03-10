package TopicWise.LinkedList;


public class FlattenList {
    public NodeWithchild flatten(NodeWithchild root)
    {
        if(root == null) return root;
    	
        NodeWithchild head = root;
        NodeWithchild temp = root.next;
    	root.next = null;
    	
    	if(root.child != null){
    	    root.next = flatten(root.child);
    	}
    	while(root.next!=null){
            root.next.prev = root;
            root.child = null;
            root.next.child = null;
    	    root = root.next;
    	}
    	root.next = temp;
    	root.next = flatten(root.next);
    	if(root.next!= null){
            root.next.prev = root;
            root.child = null;
            root.next.child = null;
        }
       	return head;
    }
}