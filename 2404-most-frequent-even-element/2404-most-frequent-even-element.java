class Solution {
    public int mostFrequentEven(int[] nums) {
        Arrays.sort(nums);
        int maxE = -1;
        int maxC = 0;
        int currE = -1;
        int currC = 0;

        for (int num : nums) {
            if (num % 2 == 0) {
                if (num == currE) {
                    currC++;
                } else {
                    currE = num;
                    currC = 1;
                }

                if (currC > maxC || (currC == maxC && num < maxE)) {
                    maxC = currC;
                    maxE = num;
                }
            }
        }

        return maxE;
    }
}