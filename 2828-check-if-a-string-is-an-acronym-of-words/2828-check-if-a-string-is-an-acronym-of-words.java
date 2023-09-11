class Solution {
    public boolean isAcronym(List<String> words, String s) {
        int sLen = s.length();
        int wLen = words.size();
        if (sLen != wLen){
            return false;
        }
            
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) != words.get(i).charAt(0)){
                return false;
            }
        }
        
        return true;
    }
}