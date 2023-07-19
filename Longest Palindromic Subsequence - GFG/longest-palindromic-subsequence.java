//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    Solution obj = new Solution();
                    System.out.println(obj.longestPalinSubseq(s));
                }
                
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int longestPalinSubseq(String S)
    {
        //code here

        int dp[][] = new int[S.length()][S.length()];


        for (int k = 0; k < S.length(); k++) {
            for (int i = 0, j = k; j < S.length(); i++, j++) {
                if (k == 0)
                    dp[i][j] = 1;
                else if (k == 1) 
                   dp[i][j] = S.charAt(i) == S.charAt(j)? 2:1;
                else
                    if(S.charAt(i)==S.charAt(j))
                        dp[i][j] = 2 +  dp[i+1][j-1];
                    else
                        dp[i][j] =  Math.max(dp[i][j-1], dp[i+1][j]);
                }
            }
        return dp[0][S.length()-1];
    }
}