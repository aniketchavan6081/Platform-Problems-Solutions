class Solution {
    public int mostFrequentEven(int[] nums) {
        Arrays.sort(nums);
        
        int maxE = -1;
        int maxCnt = 0;
        int currE = -1;
        int currCnt = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 == 0) {
                if(nums[i] == currE) {
                    currCnt++;
                }
                else{
                    currE = nums[i];
                    currCnt = 1;
                }

                if(currCnt > maxCnt || (currCnt == maxCnt && nums[i] < maxE)){
                    maxCnt = currCnt;
                    maxE = nums[i];
                }
            }
        }

        return maxE;
    }
}