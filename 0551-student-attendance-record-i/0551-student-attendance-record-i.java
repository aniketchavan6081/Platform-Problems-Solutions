class Solution {
    public boolean checkRecord(String s) {
        int aCnt = 0, lCnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {
                aCnt++;
                lCnt = 0; // Reset the consecutive 'L' count when 'A' is encountered.
            } else if (s.charAt(i) == 'L') {
                lCnt++;
                if (lCnt >= 3) {
                    return false; // Return false if there are 3 or more consecutive 'L' characters.
                }
            } else {
                lCnt = 0; // Reset the consecutive 'L' count for other characters.
            }
            
            if (aCnt >= 2) {
                return false; // Return false if there are 2 or more 'A' characters.
            }
        }
        return true;
    }
}
