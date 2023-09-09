class Solution {
    public String finalString(String s) {
       StringBuilder rev = new StringBuilder();
        for(var c : s.toCharArray()){
            if(c == 'i'){
                if(rev.length() > 0){
                    rev.reverse();
                }
                
            }else
             rev.append(c);
        }
        return rev.toString(); 
    }
}