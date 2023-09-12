class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int cnt = 0;
        int mx = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
             if(nums[i] == 1){
                 cnt++;
             }
             else{
                 cnt = 0;
             }
           mx = Math.max(mx,cnt);   
        }
        return mx;
    }
}