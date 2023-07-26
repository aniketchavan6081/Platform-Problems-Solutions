class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==1){
            return true;
        }
        
        if(n%2!=0 || n <= 0){
            return false;
        }
        
        for(int i = 0; i <= 31; i++){
            if(Math.pow(4,i) == n)
                return true;
        }
        return false;
    }
}