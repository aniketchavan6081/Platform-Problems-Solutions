/*
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int i = 0;
        while(i < nums.length - 1) {
            if(nums[i] != nums[i + 1]) {
                return nums[i];
            }
            i += 2;
        }
        return nums[nums.length - 1];
    }
}
*/

class Solution {
    public int singleNonDuplicate(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (mid % 2 == 1) {
                mid--; // Ensure mid is an even index
            }

            if (nums[mid] != nums[mid + 1]) {
                right = mid; // The non-duplicate is on the left side
            } else {
                left = mid + 2; // The non-duplicate is on the right side
            }
        }

        return nums[left];
    }
}
