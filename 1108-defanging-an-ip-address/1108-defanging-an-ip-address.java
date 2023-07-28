class Solution {
    public String defangIPaddr(String address) {
        String str = address;
        address = "";
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '.'){
                address += "[.]";
            }else{
                address += str.charAt(i);
            }
        }
        
        return address;
    }
}