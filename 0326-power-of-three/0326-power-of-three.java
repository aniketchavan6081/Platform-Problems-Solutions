class Solution {
    public boolean isPowerOfThree(int n) {
//         if(n==1){
//             return true;
//         }
        
//         if(n <= 0){
//             return false;
//         }
        
//         for(int i = 0; i <= 31; i++){
//             if(Math.pow(3,i) == n)
//                 return true;
//         }
//         return false;
        
         return ( n>0 &&  1162261467%n==0);
    }
}