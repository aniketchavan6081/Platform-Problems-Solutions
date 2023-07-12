class Solution{
    public boolean isPalindrome(String s){
        String str = s.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
        StringBuffer newStr = new StringBuffer(str).reverse();
        String rev = newStr.toString();
        return str.equals(rev);
    }
}