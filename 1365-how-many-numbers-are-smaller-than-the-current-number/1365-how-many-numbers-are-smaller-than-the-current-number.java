class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int arr[] = new int[nums.length];
        int cnt = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if(nums[j] < nums[i]){
                    cnt++;
                }
            }
            arr[i] = cnt;
            cnt = 0;
        }
        
        return arr;
    }
}