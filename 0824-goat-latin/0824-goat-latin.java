import java.util.*;
class Solution {
    public String toGoatLatin(String sentence) {
        StringTokenizer st = new StringTokenizer(sentence, " ");
        StringBuilder str = new StringBuilder();
        int cnt = 0;
        while(st.hasMoreTokens()){
            StringBuilder temp = new StringBuilder(st.nextToken());
            char ch = temp.charAt(0);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'|| ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
                temp.append("ma");
            else{
                StringBuilder wfl = new StringBuilder(temp.substring(1));
                temp = wfl.append(temp.charAt(0) + "ma");
            }
            
            for(int i = 0; i <= cnt; i++){
                temp.append("a");
            }
            if(st.hasMoreTokens() != false){
                str.append(temp + " ");
            }else{
                str.append(temp);
            }
            cnt++;
        }
        return str.toString();
    }
}