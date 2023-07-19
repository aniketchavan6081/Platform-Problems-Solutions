//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String str = br.readLine().trim();
            Solution ob = new Solution();
            int ans = ob.LongestRepeatingSubsequence(str);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int LongestRepeatingSubsequence(String str)
    {
        // code here
        int[] LongSub = new int[str.length() + 1];
        
        for (int i = 0; i <= str.length(); i++) {
            int prev = 0;
            
            for (int j = 0; j <= str.length(); j++) {
                int curr = LongSub[j];
                if (i == 0 || j == 0){
                    LongSub[j] = 0;
                }
                else if (str.charAt(i - 1) == str.charAt(j - 1) && i!=j){
                    LongSub[j] = prev + 1;
                }
                else{
                    LongSub[j] = Math.max(LongSub[j-1], LongSub[j]);
                }
                prev = curr;
            }
        }
        return LongSub[str.length()];
    }
}