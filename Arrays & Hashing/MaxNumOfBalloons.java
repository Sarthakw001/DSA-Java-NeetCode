/*
 * Given a string text, you want to use the characters of text to form as many instances of the word "balloon" as possible.
 * You can use each character in text at most once. Return the maximum number of instances that can be formed. 
 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MaxNumOfBalloons {
     public static int maxNumberOfBalloons(String text) {
        String balloon = "balloon";
        HashSet<Character> st = new HashSet<>();
        for(int i=0;i<balloon.length();i++)
            st.add(balloon.charAt(i));
        
        HashMap<Character,Integer> mp = new HashMap<>();
        for(int i=0;i<text.length();i++){
            if(st.contains(text.charAt(i))){
                mp.put(text.charAt(i),mp.getOrDefault(text.charAt(i),0)+1);
            }
        }

        if(mp.size() < 5) return 0;

        int min = Integer.MAX_VALUE;

        for(Map.Entry<Character, Integer> entry: mp.entrySet()) {
            char word = entry.getKey();
            int count = entry.getValue();
            if(word == 'l' || word == 'o') {
                min = Math.min(min, (int)Math.floor(count / 2));
            } else {
                min = Math.min(min, count);
            }
        }
        return min;
    }
}
