class Solution {
    public boolean isPalindrome(String s) {
        if (s == null){
            return false;
        }
        
        int l = 0; // to track alphabets from left side of stirng i.e.left pointer
        int r = s.length()-1; // to track alphabets from right side of stirng i.e.right pointer
        while(l<=r){
            if(!isAlphanumeric(s.charAt(l))){ //to chaeck whether the left pointer is alphanumeric or not // if non-alphanumeric then ignore // if not then skip that poition
                l++;
            }
            else if(!isAlphanumeric(s.charAt(r))){ //to chaeck whether the right pointer is alphanumeric or not // if non-alphanumeric then ignore // if not then skip that poition
                r--;
            }
            else if(Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))){ //to chaeck whether the left pointer and right pointer are equal or not
                //if equal then ignore // not equal then return false
                return false;
            }
            else{
                l++;
                r--;
            }
        }
        return true;
    }
    private boolean isAlphanumeric(char ch){
            return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9');
    }
}// A man, a plan, a canal: Panama