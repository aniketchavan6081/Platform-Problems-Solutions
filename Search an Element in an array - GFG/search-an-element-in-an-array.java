//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class Main
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            int sizeOfArray = Integer.parseInt(read.readLine());
            int arr[] = new int[sizeOfArray];
            
            String st[] = read.readLine().trim().split("\\s+");
            for(int i = 0; i < sizeOfArray; i++)
              arr[i] = Integer.parseInt(st[i]);
              
            int x = Integer.parseInt(read.readLine());
            
            Solution obj = new Solution();
            
            System.out.println(obj.search(arr, sizeOfArray, x));
        }
    }
}
// } Driver Code Ends


class Solution{
        
    static int search(int arr[], int N, int x)
    {
        
        // Your code here
        // Arrays.sort(arr);
        // int start = 0;
        // int end = N-1;
        // while(start <= end){
        //     int mid = start+(end-start)/2;
            
        //     if(arr[mid] == x){
        //         return mid;
        //     }
            
        //     if(arr[mid] < x){
        //         start = mid + 1;
        //     }
        //     else{
        //         end = mid - 1;
        //     }
        // }
        
        // return -1;
        for(int i = 0; i < N; i++){
            if(arr[i] == x){
                return i;
            }
        }
        return -1;
    }
    
}
