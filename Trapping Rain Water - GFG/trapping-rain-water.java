//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;


class Array {

	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		  
		    //size of array
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    //adding elements to the array
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Solution obj = new Solution();
		    
		    //calling trappingWater() function
		    System.out.println(obj.trappingWater(arr, n));
		}
	}
}


// } Driver Code Ends


class Solution{
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static long trappingWater(int height[], int n) { 
        
        // Your code here
        if(height.length < 2) return 0;
        
        //leftMax = max(current element, previous element) // form left side
        //rightMax = max(current element, previous element) from right side
        long leftMax[] = new long[n];
        long rightMax[] = new long[n];
        leftMax[0] = height[0];
        rightMax[n-1] = height[n-1];
        for(int i = 1; i < n; i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
            rightMax[n-1-i] = Math.max(height[n-1-i], rightMax[n-i]);
        }
        
        //water level from gound = min(leftMax, rightMax)
        //Totalwaterlevel += water level from ground - bar height
        long totalWL = 0;
        for(int i = 0; i < n; i++){
            long waterLevel = Math.min(leftMax[i], rightMax[i]);
            totalWL += waterLevel - height[i]; 
        }
        return totalWL;
    } 
}


