class Solution {
    public boolean isMonotonic(int[] nums) {
        if (nums.length <= 1) {
            return true;
        }

        boolean inc = true;
        boolean dec = true;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                inc = false;
            }
            if (nums[i] > nums[i - 1]) {
                dec = false;
            }
        }

        return inc || dec;
    }
}