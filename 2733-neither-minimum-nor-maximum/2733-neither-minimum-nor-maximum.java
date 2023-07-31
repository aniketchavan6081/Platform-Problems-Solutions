class Solution {
    public int findNonMinOrMax(int[] nums) {
        if(nums.length <= 2){
            return -1;
        }
        
        Arrays.sort(nums);
        int length = nums.length;
        if(nums[length-2] < nums[length-1] || nums[1] > nums[0]){
            return nums[1];
        }else{
            return -1;
        }
    }
}