// https://practice.geeksforgeeks.org/problems/rod-cutting0840/1/#

package G4G.DP;

import java.util.Arrays;

public class CuttingRod {
    int[] dp;
    public int cutRod(int price[], int n) {
        
        dp = new int[n+2];
        Arrays.fill(dp,-1);
        dp[0] = 0;
        dp[1] = price[0];
        return cutRodUtil(price, n);
    }
    
    int cutRodUtil(int[] price, int n)
    {
        
        if(n<=0) return dp[0];
        if(n==1) return dp[1];
        if(dp[n] != -1)
        return dp[n];
        for(int i=0; i<price.length; i++)
        {
            int result = (n-(i+1) >= 0)?(price[i] + cutRodUtil(price,n-(i+1))) : 0;
            dp[n]  = Math.max(dp[n], result);
        }
        
        return dp[n];
    }
}
