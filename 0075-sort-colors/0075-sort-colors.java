class Solution {
    public void sortColors(int[] nums) {
        for(int i = 0; i <= nums.length-2; i++){
            for(int j = 0; j <= nums.length-2-i; j++){
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp; 
                }
            }
        }
    }
}