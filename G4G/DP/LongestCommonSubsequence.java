// https://practice.geeksforgeeks.org/problems/longest-common-subsequence-1587115620/1
package G4G.DP;

public class LongestCommonSubsequence {
    int lcs( char[] X, char[] Y, int m, int n )
    {
        int L[][] = new int[m+1][n+1];
    
        for (int i=0; i<=m; i++)
        {
            for (int j=0; j<=n; j++)
            {
                if (i == 0 || j == 0)
                    L[i][j] = 0;
                else if (X[i-1] == Y[j-1])
                    L[i][j] = L[i-1][j-1] + 1;
                else
                    L[i][j] = Math.max(L[i-1][j], L[i][j-1]);
            }
        }
    return L[m][n];
    }


    int lcsSelf(char[] a, char[] b, int m, int n)
    {
        int[][] dp =  new int[m+1][n+1];
        for(int i=0; i<=)
    }
}
