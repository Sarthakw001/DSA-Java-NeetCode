/*
 * Given an array of strings strs, group the anagrams together. 
 * You can return the answer in any order.
 * An Anagram is a word or phrase formed by rearranging the 
 * letters of a different word or phrase,
 *  typically using all the original letters exactly once.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram {
    public static String sorted(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        /*
         * T.C - O(N)
         * S.C - O(N * M)
         */
        HashMap<String, List<String>> mp = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            String sortedWord = sorted(strs[i]);
            if (mp.containsKey(sortedWord)) {
                mp.get(sortedWord).add(strs[i]);
            } else {
                mp.put(sortedWord, new ArrayList<String>());
                mp.get(sortedWord).add(strs[i]);
            }
        }
        return new ArrayList<>(mp.values());
    }
}
