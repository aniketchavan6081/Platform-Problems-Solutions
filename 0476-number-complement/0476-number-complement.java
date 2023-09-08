class Solution {
    public int findComplement(int num) {
        String str = Integer.toBinaryString(num);
        StringBuffer binary = new StringBuffer();
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i)=='1'){
                binary.append('0');  
            }else{
                binary.append('1');
            }
        }
    
        return Integer.parseInt(binary.toString(), 2);
    }
}