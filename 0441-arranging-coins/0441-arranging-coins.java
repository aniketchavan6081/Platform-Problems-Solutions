class Solution {
    public int arrangeCoins(int n) {
        long i = 0;
        while((i*i+i)/2 <= n){
            ++i;
        }
        return (int)i-1;
    }
}