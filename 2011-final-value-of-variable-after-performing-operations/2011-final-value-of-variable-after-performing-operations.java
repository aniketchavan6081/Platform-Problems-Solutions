class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for(String o : operations){
            if(o.charAt(0) == '-' || o.charAt(o.length()-1) == '-'){
                x = x - 1;
            }else{
                x = x + 1;
            }
        } 
        return x;
    }
    
}