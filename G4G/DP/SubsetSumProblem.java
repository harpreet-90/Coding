// https://practice.geeksforgeeks.org/problems/subset-sum-problem-1611555638/1/
package G4G.DP;

public class SubsetSumProblem {
    int[] dp;
    Boolean isSubsetSum(int N, int arr[], int sum){
        if(N == 0) return false;
        if(sum == 0) return false;
        int totalSum = 0;
        for(int i=0; i<N; i++)
        {
            totalSum += arr[i];
        }
        return isSubsetUtil(N, arr, sum, totalSum, 0);
    }
    
    boolean isSubsetUtil(int n, int[] arr, int givenSum, int totalSum, int currentSum)
    {
        if(currentSum > givenSum) return false;
        if((totalSum-currentSum) == givenSum)
        {
            return true;
        }
        if(n<=0) return false;
        return isSubsetUtil(n-1, arr, givenSum, totalSum, currentSum+arr[n-1]) || isSubsetUtil(n-1, arr, givenSum, totalSum, currentSum);
    }
}
