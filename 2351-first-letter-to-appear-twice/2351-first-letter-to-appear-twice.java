class Solution {
    public char repeatedCharacter(String s) {
        boolean[] letters = new boolean[26]; // Represents each letter of the alphabet
    
        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a'; // Calculate the index of the current character
            
            if (letters[index]) {
                return s.charAt(i); // Found the first repeated letter
            } else {
                letters[index] = true; // Mark the letter as seen
            }
        }

        return ' '; // No repeated letter found
    }
}