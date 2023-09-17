class Solution {
    public int findPeakElement(int[] nums) {
        int mx = nums[0];
        int mxInd = 0;
        int n = nums.length;
        int s = 0;
        int e = n - 1;
        
        if(n == 1){
            return 0;
        }
        
        while(s < e) {
            if(nums[s] <= nums[e]) {
                if(nums[e] >= mx) {
                    mx = nums[e];
                    mxInd = e;
                }
                s++;
            }
            else{
                if(nums[s] >= mx) {
                    mx = nums[s];
                    mxInd = s;
                }
                e--;
            }
        }
        
        return mxInd;
        
    }
}