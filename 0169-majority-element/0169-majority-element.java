class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int maj = nums[0];
        int cnt = 0;
        // int cnt2 = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i]==nums[i+1]){
                cnt++;
            }
            if(nums.length/2 >= cnt){
                maj = nums[i];
            }
        }
        return maj;
    }
}