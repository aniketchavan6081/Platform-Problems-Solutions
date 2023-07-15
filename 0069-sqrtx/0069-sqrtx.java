class Solution {
    public int mySqrt(int x) {
        // return (int)Math.sqrt(x);
        double i=0;
        while(i*i<=x)
        {
            
            if( (i*i) <= x && (i+1)*(i+1) > x)
                return (int)i;
                i++;
        }
        return 0;
    }
}