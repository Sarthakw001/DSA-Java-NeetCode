/*
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, 
 * typically using all the original letters exactly once.
 */

public class ValidAnagram {
    public static boolean validAnagram(String s, String t) { // T.C - O(n), S.C - O(1)
        if (s.length() != t.length())
            return false;
        int[] alpha = new int[26];
        for (int i = 0; i < s.length(); i++) {
            alpha[s.charAt(i) - 97]++;
            alpha[t.charAt(i) - 97]--;
        }
        for (int i = 0; i < 26; i++)
            if (alpha[i] > 0)
                return false;
        return true;
    }

    public static void main(String[] args) {
        System.out.println(validAnagram("sarthak", "sarthkk"));
    }
}
