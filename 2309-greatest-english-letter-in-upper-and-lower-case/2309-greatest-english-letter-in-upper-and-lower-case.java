class Solution {
    public String greatestLetter(String s) {
        for (int i = 'z'; i >= 'a'; i--) {
            String lCase = Character.toString(i);
            String uCase = Character.toString(i - 32);
            if (s.contains(lCase) && s.contains(uCase)) {
                return uCase;
            }
        }

        return "";
    }
}