class Solution {
    public boolean isThree(int n) {
        
        if(n == 1 || n ==2 || n == 3){
            return false;
        }
        
        int cnt = 0;
        for(int i = 1; i <= n; i++){
            if(n%i == 0){
                cnt++;
            }
            if(cnt > 3){
                return false;
            }
        }
        if(cnt==3){
            return true;
        }else{
            return false;
        }
    }
}