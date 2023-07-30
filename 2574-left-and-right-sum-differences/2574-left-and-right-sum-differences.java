class Solution {
    public int[] leftRightDifference(int[] nums) {
        
        // if(nums.length == 1){
        //     nums[0] = 0;
        //     return nums;
        // }
        int left[] = new int[nums.length];
        left[0] = 0;
        int right[] = new int[nums.length];
        right[right.length-1] = 0;
        int ls = 0, rs = 0;
        for(int i = 1; i < nums.length; i++){
            ls += nums[i-1];
            left[i] = ls;  // 1
            rs += nums[nums.length - i];
            right[right.length - i - 1] = rs;  
        }
        
        for(int i = 0; i < nums.length; i++){
            nums[i] = Math.abs(left[i]-right[i]);
        }
        
        return nums;
    }
}