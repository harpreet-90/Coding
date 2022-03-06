package G4G;
// https://practice.geeksforgeeks.org/problems/maximum-of-all-subarrays-of-size-k3101/1
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class MaximumOfKSubArrays {
    static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k)
    {
        ArrayList<Integer> al = new ArrayList<>();

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int lastIdx = 0;
        int i = 0;
        for(i=0; i<k && i<arr.length; i++){
            pq.add(arr[i]);
        }
        for (i=0; i<k; i++){
            al.add(pq.peek());
        }

        while(i < arr.length){
            pq.remove(arr[lastIdx]);
            pq.add(arr[i]);
            al.add(pq.peek());
        }
        return al;
        
    }
}
