class Solution {
    public boolean isSameAfterReversals(int num) {
        int temp = num;
        int rev = 0;
        while(temp!=0){
            int rem = temp%10;
            rev = rem + rev*10;
            temp = temp/10;
        }
        // System.out.println(rev);
        temp = rev;
        rev = 0;
        while(temp!=0){
            int rem = temp%10;
            rev = rem + rev*10;
            temp = temp/10;
        }
        // System.out.println(rev);
        return rev == num ? true : false;
    }
}