public class KadanesAlgorithm {
    long maxSubarraySum(int arr[], int n){
        
        long INT_MIN = 1<<31;
        long max = INT_MIN, sum=0;
        for(int i=0; i<n; i++){
            sum += arr[i];
            max = (max<sum)? sum : max;
            if(sum<0){
                sum = 0;
            }
        }
        return max; 
    }
}
