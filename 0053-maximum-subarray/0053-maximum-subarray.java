// class Solution {
//     public int maxSubArray(int[] nums) {
//         int n = nums.length;
//         int maxSum = Integer.MIN_VALUE;
//         for(int i = 0; i < n; i++){
//             for(int j = 0; j < n; j++){
//                 int curSum = 0;
//                 for(int k = i; k <= j; k++){
//                     curSum += nums[k];
//                 }
//                 if(maxSum < curSum){
//                     maxSum = curSum;
//                 }
//             }
//         }
//         return maxSum;
//     }
// }

class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int maxSum = nums[0];
        int curSum = nums[0];

        for (int i = 1; i < n; i++) {
            curSum = Math.max(nums[i], curSum + nums[i]);
            maxSum = Math.max(maxSum, curSum);
        }

        return maxSum;
    }
}
