import java.math.BigInteger;
class Solution {
    public String multiply(String num1, String num2) { 
        // long n1 = Long.parseLong(num1);
        // long n2 = Long.parseLong(num2);
        // long n3 = n1*n2;
        // System.out.println(n3);
        // String s=String.valueOf(n3);  
        // return s;
        
        BigInteger n1 = new BigInteger(num1);
        BigInteger n2 = new BigInteger(num2);
        BigInteger n3 = n1.multiply(n2);

        return n3.toString();
    }
}
