class Solution {
    public int findMiddleIndex(int[] nums) {
        int larr[] = new int[nums.length];
        int rarr[] = new int[nums.length];
        
        larr[0] = nums[0];
        
        for(int i = 1; i < nums.length; i++){
            larr[i] = nums[i] + larr[i-1];
        }
        
        rarr[nums.length-1] = nums[nums.length-1];
        
        for(int i = nums.length - 2; i > -1; i--){
            rarr[i] = nums[i] + rarr[i+1];
        }
        
        for(int i = 0; i < nums.length; i++){
            if(larr[i] == rarr[i]){
                return i;
            }
        }
        return -1;
    }
}