//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            obj.printSquare(n);
        }
    }
}
// } Driver Code Ends


class Solution {

    void printSquare(int n) {
        // code here
        int center = 1;
        for(int i = 1; center <= 2*n-1; center++){
            int num = n;
            for(int j = 1; j <= 2*n-1; j++){
                System.out.print(num + " ");
                if( j < i){
                    num--;
                }
                if((j >= (2*n-1)-i+1) && j > n-1){
                    num++;
                }
            }
            System.out.println();
                
            if(center > n-1){
                i--;
            }
            else{
                i++;
            }
        }
    
    }
}