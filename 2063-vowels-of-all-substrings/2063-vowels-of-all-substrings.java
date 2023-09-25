class Solution {
    public long countVowels(String word) {
        long cnt = 0;
        int l = word.length();
        for(int i = l - 1;i >= 0; i--){
            if(isVowel(word.charAt(i))){
                cnt += (long)(i+1)*(l-i);
            }
        }
        
        return cnt;
    }

    boolean isVowel(char c){
        
        if( c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
            return true;
        }
        
        return false;
    }
}