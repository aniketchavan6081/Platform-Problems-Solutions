class Solution {
    public int maxAscendingSum(int[] nums) {
        int cur = nums[0];
        int ans = nums[0];
        for(int i=1 ;i < nums.length; i++)
        {
            if(nums[i]<=nums[i-1])
            {
                ans = Math.max(ans,cur);
                cur = nums[i];
            }
            else 
            {
                cur += nums[i];
            }
        }
        ans = Math.max(ans,cur);
        return ans;   
    }
}