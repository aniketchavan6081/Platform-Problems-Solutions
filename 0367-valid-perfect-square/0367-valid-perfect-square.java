class Solution {
    public boolean isPerfectSquare(int num) {
        if(num == Integer.MAX_VALUE){
            return false;
        }
        
        boolean found = false;
        for(int i = 1; i < Integer.MAX_VALUE; i++){
            if(i*i == num){
                found = true;
                break;
            }
            
            if(i*i > num){
                break;
            }
        }
        if(found == false){
            return false;
        }else{
            return true;
        }
    }
}