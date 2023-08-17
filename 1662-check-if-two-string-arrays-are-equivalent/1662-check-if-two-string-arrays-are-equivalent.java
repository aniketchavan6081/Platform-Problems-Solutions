class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
//         String str1 = "";
//         String str2 = "";
//         for(int i = 0; i < word1.length; i++){
//             str1 += word1[i];
//         }
//         for(int i = 0; i < word2.length; i++){
//             str2 += word2[i];
//         }
        
//         return str1.equals(str2)?true:false;
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        for(String s: word1){
            s1.append(s);
        }
        
        for(String s: word2){
            s2.append(s);
        }

        String a = s1.toString();
        String b = s2.toString();
        return a.equals(b);
    }
}