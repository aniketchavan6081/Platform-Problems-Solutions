class Solution {
    public int countKDifference(int[] nums, int k) {
        int cnt, i, j, n;
        cnt = 0;
        i = 0;
        j = 0;
        n = nums.length;
        for(i = 0; i < n-1; i++){
            for(j = i+1; j < n; j++){
                if(Math.abs(nums[i]-nums[j])==k){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}