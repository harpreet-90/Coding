package G4G.DP;

public class LongestPathInMatrix {
    int findLongestFromACell(int i, int j, int mat[][], int dp[][])
    {
        int n = mat.length;
        if (i < 0 || i >= n || j < 0 || j >= n)
            return 0;
 
        if (dp[i][j] != -1)
            return dp[i][j];
 
        // Since all numbers are unique and in range from 1 to n*n,
        // there is atmost one possible direction from any cell
        if (j < n - 1 && ((mat[i][j] + 1) == mat[i][j + 1]))
            dp[i][j] = Math.max(dp[i][j], 1 + findLongestFromACell(i, j + 1, mat, dp));
 
        if (j > 0 && (mat[i][j] + 1 == mat[i][j - 1]))
            dp[i][j] = Math.max(dp[i][j], 1 + findLongestFromACell(i, j - 1, mat, dp));
 
        if (i > 0 && (mat[i][j] + 1 == mat[i - 1][j]))
            dp[i][j] = Math.max(dp[i][j], 1 + findLongestFromACell(i - 1, j, mat, dp));
 
        if (i < n - 1 && (mat[i][j] + 1 == mat[i + 1][j]))
            dp[i][j] =  Math.max(dp[i][j], 1 + findLongestFromACell(i + 1, j, mat, dp));
        
        return dp[i][j];
    }

    
}
