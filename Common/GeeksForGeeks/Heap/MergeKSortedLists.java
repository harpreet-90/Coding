package Heap;

import java.util.PriorityQueue;

import LinkedList.Node;

class NodeIndexPair implements Comparable<NodeIndexPair>{
    Node node = null;
    int index = 0;

    NodeIndexPair(Node node, int idx){
        this.node = node;
        this.index = idx;
    }

    // @Override
    // public int compare(NodeIndexPair o1, NodeIndexPair o2) {
    //     return o1.node.value - o2.node.value;
    // }

    @Override
    public int compareTo(NodeIndexPair o) {
        return this.node.value - o.node.value;
    }
} 
public class MergeKSortedLists {
    Node mergeKList(Node[]arr,int K)
    {
        Node head = null, tail = null;
        PriorityQueue<NodeIndexPair> pq = new PriorityQueue<NodeIndexPair>();
        for(int i=0; i<K; i++){
            pq.add(new NodeIndexPair(arr[i],i));
            arr[i] = arr[i].next;
        }
        while(!pq.isEmpty()){
            NodeIndexPair p = pq.poll();
            p.node.next = null;
            if(arr[p.index] != null)
            {
                pq.add(new NodeIndexPair(arr[p.index], p.index));
                arr[p.index] = arr[p.index].next;
            }
            if(head == null)
            {
                head = p.node;
                tail = head;
            }
            else
            {
                tail.next = p.node;
                tail = p.node;
            }
        }
        return head;
    }
}
