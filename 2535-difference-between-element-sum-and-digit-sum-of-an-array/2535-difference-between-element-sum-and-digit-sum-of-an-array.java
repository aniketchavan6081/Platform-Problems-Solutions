class Solution {
    public int differenceOfSum(int[] nums) {
        int eSum = 0;
        for(int i = 0; i < nums.length; i++){
            eSum += nums[i];
        }
        
        int dSum = 0;
        for(int i = 0; i < nums.length; i++){
            int n = nums[i];
            while(n!=0){
                dSum += n%10;
                n = n/10;
            }
        }
        
        int diff = eSum - dSum;
        
        return Math.abs(diff);
    }
}