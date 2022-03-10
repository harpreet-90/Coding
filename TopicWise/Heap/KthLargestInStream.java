package TopicWise.Heap;
import java.util.PriorityQueue;

public class KthLargestInStream {
    public static int[] kthLargest(int k, int[] arr, int n) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(k);
        for(int i=0; i<arr.length; i++){
            if(((pq.size()>0) && pq.peek() < arr[i])|| (pq.size() < k)){
                if(pq.size()==k){
                    pq.poll();
                }
                pq.add(arr[i]);
            }
            arr[i] = (pq.size() == k)? pq.peek(): -1;
        }
        return arr;
    }
}
