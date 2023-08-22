class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.equals("")){
            return true;
        }
        
        int len = s.length();
        int cnt = 0;
        int j = 0;
        for(int i = 0; i < t.length(); i++){
            if(t.charAt(i) == s.charAt(j) && j < len){
                cnt++;
                j++;
            }
            
            if(cnt == len){
                return true;
            }
        }
        return false;
    }
}