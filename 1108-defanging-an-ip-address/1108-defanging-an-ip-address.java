class Solution {
    public String defangIPaddr(String address) {
        StringBuffer result = new StringBuffer();

        for(int i=0;i<address.length();i++){
            if(address.charAt(i) == '.'){
                result.append("[.]");
            }
            else{
                result.append(address.charAt(i));
            }
        }

        return result.toString();

    }
}