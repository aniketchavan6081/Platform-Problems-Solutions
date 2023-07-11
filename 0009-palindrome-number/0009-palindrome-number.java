class Solution {
    public boolean isPalindrome(int x) {
        int y = x;
        int rev = 0;
        while(x!=0){
            rev = rev*10 + x%10;
            x /= 10;
        }
        if(rev==y && y >= 0){
            return true;
        }
        else{
            return false;
        }
    }
}