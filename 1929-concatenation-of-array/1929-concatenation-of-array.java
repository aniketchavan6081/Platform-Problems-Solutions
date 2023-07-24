class Solution {
    public int[] getConcatenation(int[] nums) {
        int ans[] = new int[nums.length*2];
        int j = 0;
        for(int i = 0; i < ans.length; i++){
            if(i < nums.length){
                ans[i] = nums[j];
                j++;
            }
            else if(i == nums.length){
                j = 0;
                ans[i] = ans[j];
                j++;
            }else{
                ans[i] = ans[j];
                j++;
            }
        } 
        return ans;
    }
}