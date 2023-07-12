class Solution {
    public int divide(int dividend, int divisor) {
        if (divisor == 0) {
            if(dividend >= 0){
                return Integer.MAX_VALUE;
            }
            else{
                return Integer.MIN_VALUE;
            }
        }
        
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        
        int quotient = dividend / divisor;
        return quotient;
    }
}
