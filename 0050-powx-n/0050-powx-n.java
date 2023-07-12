class Solution {
    public double myPow(double x, int n) {
        // return Math.pow(x,n);
        
        if(n==0) return 1; // if pow is 0 return 1
        if(n==1) return x; // if pow is 1 return that number
        if(n==-1) return 1/x; // if pow is then return 1/x;

        double ans = myPow(x,n/2); // recursive call by passing half power
       
        if(n>0)
            return n%2==0 ? ans*ans : ans*ans*x;
        else 
            return n%2==0 ? ans*ans : ans*ans/x;
    }
}