import java.util.StringTokenizer;
class Solution {    
    public String reverseWords(String s) {
        StringTokenizer st = new StringTokenizer(s);
        String str = "";
        int cnt = 0;
        int n = st.countTokens();
        while(st.hasMoreTokens()){
            StringBuffer sb = new StringBuffer(st.nextToken());
            str += sb.reverse().toString();
            cnt++;
            if(cnt == n){
                break;
            }
            str += " ";
        }
        return str;
    }
}