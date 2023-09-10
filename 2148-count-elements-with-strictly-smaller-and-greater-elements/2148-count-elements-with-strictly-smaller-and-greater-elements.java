class Solution {
    public int countElements(int[] nums) {
        Arrays.sort(nums);
        int x = 0;
        int y = 0;
        int n = nums.length;
        int first = nums[0];
        int last = nums[n-1];
        for(int i = 0; i < n; i++){
            if(first == nums[i]){
                x++;
            }
            else if(last == nums[i]){
                y++;
            }
        }
        return n-(x+y);
    }
}