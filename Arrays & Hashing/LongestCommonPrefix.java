/*
 * Write a function to find the longest common prefix string amongst an array of strings.
 * If there is no common prefix, return an empty string "".
 */

import java.util.Arrays;

public class LongestCommonPrefix {
    public String longestCommonPrefix1(String[] strs) {
        String ans = strs[0];
        String str = strs[0];
        for (int i = 1; i < strs.length; i++) {
            int m = 0, n = 0;
            String tempAns = "";
            while (m < str.length() && n < strs[i].length()) {
                if (str.charAt(m) == strs[i].charAt(n))
                    tempAns += str.charAt(m);
                else
                    break;
                m++;
                n++;
            }
            if (tempAns.length() < ans.length())
                ans = tempAns;
        }
        return ans;
    }

    public String longestCommonPrefix2(String[] strs) {
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length - 1];
        String ans = "";
        int m = 0, n = 0;
        while (m < s1.length() && n < s2.length()) {
            if (s1.charAt(m) != s2.charAt(n))
                break;
            ans += s1.charAt(m);
            m++;
            n++;
        }
        return ans;
    }
}
