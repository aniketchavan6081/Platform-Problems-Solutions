class Solution {
    public String reverseVowels(String s) {
        String str = ""; // eo
        int j = 0;
        char a[] = s.toCharArray();
        for(int i = 0; i < a.length; i++){
            if(a[i] == 'a' || a[i] == 'i' || a[i] == 'o' || a[i] == 'u' || a[i] == 'e' || a[i] == 'A' || a[i] == 'I' || a[i] == 'O' || a[i] == 'U' || a[i] == 'E'){
                str += a[i]; 
                j++;
            }
        }
        
        StringBuffer sb = new StringBuffer(str);
        str = sb.reverse().toString();
        
        int k = 0;
        for(int i = 0; i < s.length(); i++){
            if(a[i] == 'a' || a[i] == 'i' || a[i] == 'o' || a[i] == 'u' || a[i] == 'e' || a[i] == 'A' || a[i] == 'I' || a[i] == 'O' || a[i] == 'U' || a[i] == 'E'){
                a[i] = str.charAt(k);
                k++;
            }
            if(j==k){
                break;
            }
        }
        s = new String(a);
        return s;
    }
}