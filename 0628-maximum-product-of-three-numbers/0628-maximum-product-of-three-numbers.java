class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        
        int prod1, prod2, len;
        len = nums.length;
        prod1 = nums[0]*nums[1]*nums[len-1];
        prod2 = nums[len-1]*nums[len-2]*nums[len-3];
        
        int maxProd = Integer.max(prod1, prod2);
        
        return maxProd;
//         Arrays.sort(nums);
//         int case1 = nums[0]*nums[1]*nums[nums.length-1];
//         int case2 = nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];

//         int maxProduct = Integer.max(case1, case2);
//         return maxProduct;

    }
}