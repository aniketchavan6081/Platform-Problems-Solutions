class Solution {
    public int dominantIndex(int[] nums) {
        // int len = nums.length;
        // int arr[] = new int[nums.length];
        // for(int i = 0; i < len; i++){
        //     arr[i] = nums[i];
        // }
        // Arrays.sort(arr);
        // if(arr[len-1] >= arr[len-2]*2){
        //     for(int i = 0; i < len; i++){
        //         // System.out.println(nums[i]);
        //         if(arr[len-1]==nums[i]){
        //             return i;
        //         }
        //     }
        // }
        // return -1;
        int result = Integer.MIN_VALUE;
        int tmp = 0;
        int ans = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] > result) {
                tmp = result;
                result = nums[i];
                ans = i;
            } else if (nums[i] > tmp) 
                tmp = nums[i];
        }
        if(result >= tmp*2){
            return ans;
        }
        return -1;
    }
}