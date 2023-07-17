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
            public static int maxSubArray(int nums[]){
                int msum = Integer.MIN_VALUE;
                int csum = 0;
                for(int i = 0; i < nums.length; i++){
                        csum += nums[i];
                        msum = Math.max(msum,csum);
                        if(csum < 0){
                                csum = 0;
                        }
                }
                return msum;
        }
}