/*
 * Given two strings s and t, determine if they are isomorphic.
 * Two strings s and t are isomorphic if the characters in s can be replaced to get t.
 * All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.
 */

import java.util.HashMap;

class IsomorphicStrings {
    public static boolean checkIsIsomorphic(String s, String t) {
        /*
         * T.C - O(n)
         * S.C - O(n)
         */
        HashMap<Character, Character> mp = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (mp.containsKey(s.charAt(i)) && mp.get(s.charAt(i)) != t.charAt(i)) {
                return false;
            } else
                mp.put(s.charAt(i), t.charAt(i));
        }
        return true;
    }

    public static boolean isIsomorphic(String s, String t) {
        /*
         * T.C - O(n) + O(n) = O(n)
         * S.C - O(n)
         */
        if (checkIsIsomorphic(s, t) && checkIsIsomorphic(t, s))
            return true;
        return false;
    }
}