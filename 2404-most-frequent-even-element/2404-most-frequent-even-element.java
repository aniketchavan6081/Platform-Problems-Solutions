class Solution {
    public int mostFrequentEven(int[] nums) {
        int maxE = -1;
        int maxCnt = 0;

        for (int i : nums) {
            if (i % 2 == 0) {
                int cnt = 0;
                for (int j : nums) {
                    if (i == j) {
                        cnt++;
                    }
                }
                
                if (cnt > maxCnt || (cnt == maxCnt && i < maxE)) {
                    maxCnt = cnt;
                    maxE = i;
                }
            }
        }

        return maxE;
    }
}