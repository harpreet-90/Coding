package G4G.DP;

import java.util.*;

public class CoinChangeWays {
    static long countWays(int S[], int m, int n)
    {
       
        long[] ways = new long[n+1];
        Arrays.fill(ways, 0);  
        ways[0] = 1;
 
        for (int i=0; i<m; i++)
        {
            for (int j=S[i]; j<=n; j++)
            {
                ways[j] += ways[j-S[i]];
            }
        }
 
        return ways[n];
    }
}
