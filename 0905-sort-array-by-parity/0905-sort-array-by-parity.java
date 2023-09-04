class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int cnt = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i]%2 == 0){
                cnt++;
            }
        }
        int earr[] = new int[cnt];
        int oarr[] = new int[nums.length-cnt];
        for(int i = 0, j = 0, k = 0; i < nums.length; i++){
            if(nums[i]%2 == 0){
                earr[j] = nums[i];
                j++;
            }else{
                oarr[k] = nums[i];
                k++;
            }
        }
        
        for(int i = 0, j = 0; i < nums.length; i++){
            if(earr.length > i){
                nums[i] = earr[i];
            }else{
                nums[i] = oarr[j];
                j++;
            }
        }
        
        return nums;
        
    }
}