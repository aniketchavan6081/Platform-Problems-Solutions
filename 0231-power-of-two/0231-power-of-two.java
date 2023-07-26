class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==1 || n==2 ){
            return true;            
        }
        
        if(n%2 != 0 || n <= 0){
            return false;
        }
        
        int temp = n; 
        
        int cnt = 0;
        
        while(temp != 1){
            temp = temp/2; 
            cnt++; 
        }
        
        if((double) n == Math.pow(2, cnt)){
            return true;
        }  
        return false;
       
    }
}
