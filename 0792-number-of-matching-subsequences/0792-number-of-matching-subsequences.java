class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        int cnt = 0;
        for (int i = 0; i < words.length; i++) {
            int temp = 0;
            for (int j = 0; j < words[i].length(); j++) {
                temp = s.indexOf(words[i].charAt(j), temp);
                if (temp == -1) {
                    break;
                }
                temp++;
            }
            if (temp != -1) {
                cnt++;
            }
        }
        return cnt;
    }
}