public class Main {
    public static void main(String[] args)
    {
        int[] arr = {-1, -2, -3, -4};
        KadanesAlgorithm k = new KadanesAlgorithm();
        System.out.println(k.maxSubarraySum(arr,4));
    }
}
