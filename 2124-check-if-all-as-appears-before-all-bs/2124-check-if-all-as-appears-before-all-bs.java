class Solution {
    public boolean checkString(String s) {
        for(int i = 0; i < s.length()-1; i++){
            boolean isB = s.charAt(i) == 'b';
            boolean isA = s.charAt(i+1) == 'a';
            if(isB && isA){
                return false;
            }
        }
        return true;
    }
}