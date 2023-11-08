/*
 * Given a pattern and a string s, find if s follows the same pattern.
 * Here follow means a full match, such that there is a bijection between a l
 * etter in pattern and a non-empty word in s.
 */

import java.util.HashMap;

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");
        if (pattern.length() != arr.length)
            return false;
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
        HashMap<Character, String> mp = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            char c = pattern.charAt(i);
            String str = arr[i];
            if (mp.containsKey(c)) {
                if (!mp.get(c).equals(str))
                    return false;
            } else {
                if (mp.containsValue(str))
                    return false;
                mp.put(c, str);
            }
        }
        return true;
    }
}
