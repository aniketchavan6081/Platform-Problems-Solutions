class Solution {
    public boolean rotateString(String s, String goal) {
        for(int i = 0; i < s.length(); i++){
            String str1 = s.substring(0, s.length()-1);
            String str2 = s.substring(s.length()-1);
            String str3 = str2 + str1;
            if(str3.equals(goal)){
                return true;
            }
            s = str3;
        }
        return false;
    }
}