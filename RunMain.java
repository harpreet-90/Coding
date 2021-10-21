
import Heap.KthLargestInStream;
// import Trees.*;

public class RunMain
{

    public static void main(String args[])
    {
        int k = 4, n = 6;
        int arr[] = {1, 2, 3, 4, 5, 6};
        System.out.println(KthLargestInStream.kthLargest(k, arr, n));
        
    }
}
