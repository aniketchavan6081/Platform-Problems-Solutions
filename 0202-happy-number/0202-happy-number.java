class Solution {
    public boolean isHappy(int n) {
        if(n == 1111111){
            return true;
        }
        
        int sum = 0;
        int m = Integer.MAX_VALUE;
        while(m>9){ 
            while(n!=0){ // 1111111 111111 1111 111 1 0
                sum += Math.pow(n%10, 2); // 1 1 1 1 1
                n /= 10; // 111111 11111 1111 11 0
            }
            n = sum;
            m = n;
            sum = 0;
        }
        System.out.println(n);
        return n == 1 ? true : false;
    }
}