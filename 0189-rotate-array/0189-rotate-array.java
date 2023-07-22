class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n; // if k is larger than array length
        
        reverse(nums, 0, n - 1); // reversing array from start to end
        reverse(nums, 0, k - 1); // reversing array from start to kth position
        reverse(nums, k, n - 1); // reversing array from kth position to end
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
