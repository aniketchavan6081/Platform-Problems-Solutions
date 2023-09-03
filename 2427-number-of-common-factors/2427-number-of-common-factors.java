class Solution {
    public int commonFactors(int a, int b) {
        int cnt = 0;
        int mn = Math.min(a,b);
        for(int i = 1; i <= mn; i++){
            if(a%i == 0 && b%i == 0){
                cnt++;
            }
        }
        return cnt;
    }
}