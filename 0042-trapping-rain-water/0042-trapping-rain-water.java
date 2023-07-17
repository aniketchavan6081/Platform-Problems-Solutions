class Solution {
    public int trap(int[] height) {
        int n = height.length;
        
        if(n == 2){
            return 0;
        }
        
        int ascCount = 1, dscCount = 1;
        
        for(int i = 1; i < n; i++){
            if(height[i-1]<height[i]){
                ascCount++;
            }
            if(height[i-1]>height[i]){
                dscCount++;
            }
        }
        
        if(ascCount == n || dscCount == n){
            return 0;
        }
        
        // auxilary array
        // leftmax[] ==> leftmax[i] = max(leftmax[i-1],height[i])
        // rightmax[] ==> rightmax[n-1-i] = max(rightmax[n-i], height[n-1-i])
        int leftMax[] = new int[n];
        int rightMax[] = new int[n];
        leftMax[0] = height[0];
        rightMax[n-1] = height[n-1];
        for(int i = 1; i < n; i++){
            leftMax[i] = Math.max(leftMax[i-1], height[i]);
            rightMax[n-1-i] = Math.max(rightMax[n-i], height[n-1-i]);
        }
        
        // loop 
        // waterlevel = min(leftmax[i], rightmax[i])
        // totalwater = (waterlevel - hight[i])*width ==> but here width is not present
        int totalWater = 0;
        for(int i = 0; i < n; i++){
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            totalWater += waterLevel-height[i];
        }
        return totalWater;
    }
}