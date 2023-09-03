class Solution {
    public int commonFactors(int a, int b) {
        int cnt = 0;
        int mx = Math.max(a,b);
        for(int i = 1; i <= 1000; i++){
            if(a%i == 0 && b%i == 0){
                cnt++;
            }
            if(i > mx){
                break;
            }
        }
        return cnt;
    }
}