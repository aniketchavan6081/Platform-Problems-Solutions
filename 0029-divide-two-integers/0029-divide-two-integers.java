class Solution {
    public int divide(int dividend, int divisor) {
        if (divisor == 0) {
            if(dividend >= 0){
                return 2147483647;
            }
            else{
                return -2147483648;
            }
        }
        
        if (dividend == -2147483648 && divisor == -1) {
            return 2147483647;
        }
        
        int quotient = dividend / divisor;
        return quotient;
    }
}
