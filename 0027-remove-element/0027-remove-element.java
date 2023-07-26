class Solution {
    public int removeElement(int[] nums, int val) {
        int arr[] = new int[nums.length];
        arr = nums;
        int cnt = 0;
        int j = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == val){
                cnt++;
            }
            else{
              nums[j] = arr[i];  
                j++;
            } 
        }
        return nums.length-cnt;
    }
}